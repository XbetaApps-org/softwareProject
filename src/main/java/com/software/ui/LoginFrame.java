package com.software.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.software.models.User;

public class LoginFrame extends javax.swing.JFrame {
    private static final Logger LOGGER = Logger.getLogger(LoginFrame.class.getName());

    // Define constants for repeated literals
    private static final String ADMIN = "admin";
    private static final String USER = "user";
    private static final String STORE_OWNER = "store owner";
    private static final String SUPPLIER = "supplier";

    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<User> owners = new ArrayList<>();
    private ArrayList<User> suppliers = new ArrayList<>();
    private Properties configProperties;

    // GUI components
    private javax.swing.JTextField userNameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox<String> jComboBox1;

    private String message; // For storing login status messages

    public LoginFrame() {
        initComponents();
        loadData(users, "users.txt");
        loadData(owners, "owners.txt");
        loadData(suppliers, "suppliers.txt");
        loadConfigProperties(); // Load configuration properties
    }

    private void loadData(ArrayList<User> userList, String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    userList.add(new User(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error loading data from file: " + fileName, e);
        }
    }

    private void loadConfigProperties() {
        configProperties = new Properties();
        try (BufferedReader reader = new BufferedReader(new FileReader("config.properties"))) {
            configProperties.load(reader);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error loading configuration properties", e);
        }
    }

    // This method initializes the GUI components
    @SuppressWarnings("unchecked")
    private void initComponents() {
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>(new String[]{ADMIN, USER, STORE_OWNER, SUPPLIER});

        javax.swing.JButton loginButton = new javax.swing.JButton("Login");
        loginButton.addActionListener(this::loginButtonActionPerformed);

        // Layout settings for components (this is a simple layout example)
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            // Layout configuration code goes here
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            // Layout configuration code goes here
        );

        pack();
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = userNameField.getText();
        String password = new String(passwordField.getPassword());
        String hashedPassword = hashPassword(password);
        String userType = String.valueOf(jComboBox1.getSelectedItem());

        if (isAdminLogin(userType, username, hashedPassword)) {
            performAdminLogin();
        } else {
            handleUserLogin(userType, username, hashedPassword);
        }
    }

    private boolean isAdminLogin(String userType, String username, String hashedPassword) {
        String adminUsername = configProperties.getProperty("admin.username", ADMIN);
        String adminHashedPassword = configProperties.getProperty("admin.password.hash", "21232f297a57a5a743894a0e4a801fc3"); // Default MD5 hash for 'admin'

        return ADMIN.equals(userType)
               && adminUsername.equals(username)
               && adminHashedPassword.equals(hashedPassword);
    }

    private void performAdminLogin() {
        message = "Login successful as " + ADMIN;
        Index index = new Index();
        index.setVisible(true);
        this.dispose();
    }

    private void handleUserLogin(String userType, String username, String hashedPassword) {
        ArrayList<User> currentList = getUserListByType(userType);

        for (User user : currentList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(hashedPassword)) {
                performUserLogin(userType, user);
                return;
            }
        }

        message = "Invalid username or password";
        JOptionPane.showMessageDialog(this, message);
    }

    private void performUserLogin(String userType, User user) {
        message = "Login successful as " + userType;

        switch (userType) {
            case USER:
                UserIndex uindex = new UserIndex();
                uindex.setVisible(true);
                break;
            case STORE_OWNER:
                OwnerIndex oindex = new OwnerIndex();
                oindex.setVisible(true);
                break;
            case SUPPLIER:
                SupplierIndex sindex = new SupplierIndex();
                sindex.setVisible(true);
                break;
            default:
                LOGGER.warning("Unknown user type: " + userType);
                break;
        }

        this.dispose();
    }

    private ArrayList<User> getUserListByType(String userType) {
        switch (userType) {
            case USER:
                return users;
            case STORE_OWNER:
                return owners;
            case SUPPLIER:
                return suppliers;
            default:
                LOGGER.warning("Unknown user type: " + userType);
                return new ArrayList<>();
        }
    }

    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            LOGGER.log(Level.SEVERE, "Hashing algorithm not found", e);
            return null;
        }
    }

    // Public setter methods for test access
    public void setUserNameField(String username) {
        this.userNameField.setText(username);
    }

    public void setPasswordField(String password) {
        this.passwordField.setText(password);
    }

    public void setUserType(String userType) {
        this.jComboBox1.setSelectedItem(userType);
    }

    // Public getter for the message (used in tests)
    public String getDisplayedMessage() {
        return message;
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}
