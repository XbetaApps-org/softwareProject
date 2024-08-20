package com.software.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import com.software.models.User;

public class LoginFrame extends JFrame implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginFrame.class.getName());

    // Define constants for repeated literals
    private static final String ADMIN = "admin";
    private static final String USER = "user";
    private static final String STORE_OWNER = "store owner";
    private static final String SUPPLIER = "supplier";

    // Making these collections transient since they may not need to be serialized
    private transient ArrayList<User> users = new ArrayList<>();
    private transient ArrayList<User> owners = new ArrayList<>();
    private transient ArrayList<User> suppliers = new ArrayList<>();
    private Properties configProperties;

    // GUI components
    private JTextField userNameField;
    private JPasswordField passwordField;
    private JComboBox<String> userTypeComboBox;
    private JButton loginButton;
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
    private void initComponents() {
        userNameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        userTypeComboBox = new JComboBox<>(new String[]{ADMIN, USER, STORE_OWNER, SUPPLIER});
        loginButton = new JButton("Login");
        loginButton.addActionListener(e -> loginButtonActionPerformed());

        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JLabel typeLabel = new JLabel("User Type:");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(userLabel);
        panel.add(userNameField);
        panel.add(passLabel);
        panel.add(passwordField);
        panel.add(typeLabel);
        panel.add(userTypeComboBox);
        panel.add(loginButton);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Use static access for EXIT_ON_CLOSE
    }

    private void loginButtonActionPerformed() {
        String username = userNameField.getText();
        String password = new String(passwordField.getPassword());
        String hashedPassword = hashPassword(password);
        String userType = (String) userTypeComboBox.getSelectedItem();

        if (isAdminLogin(userType, username, hashedPassword)) {
            performAdminLogin();
        } else {
            handleUserLogin(userType, username, hashedPassword);
        }
    }

    private boolean isAdminLogin(String userType, String username, String hashedPassword) {
        String adminUsername = configProperties.getProperty("admin.username", ADMIN);
        String adminHashedPassword = configProperties.getProperty("admin.password.hash", "21232f297a57a5a743894a0e4a801fc3"); // Default MD5 hash for 'admin'

        return ADMIN.equalsIgnoreCase(userType)
                && adminUsername.equals(username)
                && adminHashedPassword.equals(hashedPassword);
    }

    private void performAdminLogin() {
        message = "Login successful as " + ADMIN;
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);
        Index index = new Index();
        index.setVisible(true);
        this.dispose();
    }

    private void handleUserLogin(String userType, String username, String hashedPassword) {
        ArrayList<User> currentList = getUserListByType(userType);

        for (User user : currentList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(hashedPassword)) {
                performUserLogin(userType);
                return;
            }
        }

        message = "Invalid username or password";
        JOptionPane.showMessageDialog(this, message, "Login Failed", JOptionPane.ERROR_MESSAGE);
    }

    private void performUserLogin(String userType) {
        message = "Login successful as " + userType;
        JOptionPane.showMessageDialog(this, message, "Success", JOptionPane.INFORMATION_MESSAGE);

        switch (userType.toLowerCase()) {
            case USER:
                UserIndex userIndex = new UserIndex();
                userIndex.setVisible(true);
                break;
            case STORE_OWNER:
                OwnerIndex ownerIndex = new OwnerIndex();
                ownerIndex.setVisible(true);
                break;
            case SUPPLIER:
                SupplierIndex supplierIndex = new SupplierIndex();
                supplierIndex.setVisible(true);
                break;
            default:
                LOGGER.warning("Unknown user type: " + userType);
                break;
        }

        this.dispose();
    }

    private ArrayList<User> getUserListByType(String userType) {
        switch (userType.toLowerCase()) {
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
            LOGGER.log(Level.SEVERE, "MD5 algorithm not found", e);
            return null;
        }
    }

    // Public getter methods for test access
    public void setUserNameField(String username) {
        this.userNameField.setText(username);
    }

    public void setPasswordField(String password) {
        this.passwordField.setText(password);
    }

    public void setUserType(String userType) {
        this.userTypeComboBox.setSelectedItem(userType);
    }

    public String getDisplayedMessage() {
        return message;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}
