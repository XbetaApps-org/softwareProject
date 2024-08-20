package com.software.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;
import com.software.models.User;

public class LoginFrame extends javax.swing.JFrame {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<User> owners = new ArrayList<>();
    private ArrayList<User> suppliers = new ArrayList<>();
    private Properties configProperties;

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
            e.printStackTrace();
        }
    }

    private void loadConfigProperties() {
        configProperties = new Properties();
        try (BufferedReader reader = new BufferedReader(new FileReader("config.properties"))) {
            configProperties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = userNameField.getText();
        String password = new String(PasswordField.getPassword());
        String hashedPassword = hashPassword(password);
        String userType = String.valueOf(jComboBox1.getSelectedItem());

        if (isAdminLogin(userType, username, hashedPassword)) {
            performAdminLogin();
        } else {
            handleUserLogin(userType, username, hashedPassword);
        }
    }

    private boolean isAdminLogin(String userType, String username, String hashedPassword) {
        String adminUsername = configProperties.getProperty("admin.username", "admin");
        String adminHashedPassword = configProperties.getProperty("admin.password.hash", "21232f297a57a5a743894a0e4a801fc3"); // Default MD5 hash for 'admin'
        
        return adminUsername.equals(userType) 
               && adminUsername.equals(username) 
               && adminHashedPassword.equals(hashedPassword);
    }

    private void performAdminLogin() {
        message = "Login successful as admin";
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
            case "user":
                UserIndex uindex = new UserIndex();
                uindex.setVisible(true);
                break;
            case "store owner":
                OwnerIndex oindex = new OwnerIndex();
                oindex.setVisible(true);
                break;
            case "supplier":
                SupplierIndex sindex = new SupplierIndex();
                sindex.setVisible(true);
                break;
        }

        this.dispose();
    }

    private ArrayList<User> getUserListByType(String userType) {
        switch (userType) {
            case "user":
                return users;
            case "store owner":
                return owners;
            case "supplier":
                return suppliers;
            default:
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
            e.printStackTrace();
            return null;
        }
    }
}
