package com.software.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import com.software.models.User;

public class AccountsFrame extends javax.swing.JFrame {

    private static final Logger LOGGER = Logger.getLogger(AccountsFrame.class.getName());
    private static final String FONT_SEGOE_UI = "Segoe UI";
    private static final String FONT_ARABIC_FIXED = "Simplified Arabic Fixed";

    private javax.swing.JTextField cityField;
    private javax.swing.JTextField emailField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox<String> userTypeComboBox;
    private javax.swing.JComboBox<String> actionTypeComboBox;
    private javax.swing.JTextField userNameField;
    private String message;

    public AccountsFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        javax.swing.JPanel mainPanel = new javax.swing.JPanel();
        javax.swing.JPanel headerPanel = new javax.swing.JPanel();
        
        javax.swing.JLabel titleLabel = new javax.swing.JLabel();
        titleLabel.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 24));
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Accounts Management");

        userTypeComboBox = new javax.swing.JComboBox<>();
        actionTypeComboBox = new javax.swing.JComboBox<>();
        emailField = new javax.swing.JTextField();
        javax.swing.JLabel emailLabel = new javax.swing.JLabel();
        emailLabel.setFont(new java.awt.Font(FONT_ARABIC_FIXED, 1, 14));
        emailLabel.setText("Email");

        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        javax.swing.JLabel passwordLabel = new javax.swing.JLabel();
        passwordLabel.setFont(new java.awt.Font(FONT_ARABIC_FIXED, 1, 14));
        passwordLabel.setText("Password");

        cityField = new javax.swing.JTextField();
        javax.swing.JLabel cityLabel = new javax.swing.JLabel();
        cityLabel.setFont(new java.awt.Font(FONT_ARABIC_FIXED, 1, 14));
        cityLabel.setText("City");

        javax.swing.JButton submitButton = new javax.swing.JButton();
        submitButton.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 15));
        submitButton.setText("Submit");
        submitButton.addActionListener(evt -> handleSubmitButton());

        javax.swing.JButton backButton = new javax.swing.JButton();
        backButton.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 15));
        backButton.setText("Back To Home");
        backButton.addActionListener(evt -> handleBackButton());

        // Layout settings for components...

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
    }

    public void handleSubmitButton() {
        String userType = userTypeComboBox.getSelectedItem().toString();
        String actionType = actionTypeComboBox.getSelectedItem().toString();
        String username = userNameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String city = cityField.getText();

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format");
            message = "Invalid email format";
            return;
        }

        String hashedPassword = hashPassword(password);
        User newUser = new User(username, email, hashedPassword, city);
        ArrayList<User> userList = loadUserList(userType);

        switch (actionType) {
            case "Add":
                if (userExists(userList, username, email)) {
                    JOptionPane.showMessageDialog(this, userType + " already exists");
                    message = userType + " already exists";
                } else {
                    userList.add(newUser);
                    saveUserList(userList, getFileName(userType));
                    JOptionPane.showMessageDialog(this, userType + " added successfully");
                    message = userType + " added successfully";
                }
                break;
            case "Edit":
                if (!userExists(userList, username, email)) {
                    JOptionPane.showMessageDialog(this, userType + " that you want to edit does not exist");
                    message = userType + " that you want to edit does not exist";
                } else {
                    editUser(userList, newUser);
                    saveUserList(userList, getFileName(userType));
                    JOptionPane.showMessageDialog(this, userType + " edited successfully");
                    message = userType + " edited successfully";
                }
                break;
            case "Delete":
                if (!userExists(userList, username, email)) {
                    JOptionPane.showMessageDialog(this, userType + " that you want to delete does not exist");
                    message = userType + " that you want to delete does not exist";
                } else {
                    deleteUser(userList, username, email);
                    saveUserList(userList, getFileName(userType));
                    JOptionPane.showMessageDialog(this, userType + " deleted successfully");
                    message = userType + " deleted successfully";
                }
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid action");
                message = "Invalid action";
                break;
        }
    }

    public void handleBackButton() {
        message = "Welcome To Home";
        Index index = new Index();
        index.setVisible(true);
        this.dispose();
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
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
            LOGGER.severe("Hashing algorithm not found: " + e.getMessage());
            return null;
        }
    }

    private ArrayList<User> loadUserList(String userType) {
        ArrayList<User> userList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(getFileName(userType)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    userList.add(new User(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        } catch (IOException e) {
            LOGGER.severe("Error reading user list: " + e.getMessage());
        }
        return userList;
    }

    private void saveUserList(ArrayList<User> userList, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : userList) {
                bw.write(user.getUsername() + " " + user.getEmail() + " " + user.getPassword() + " " + user.getCity());
                bw.newLine();
            }
        } catch (IOException e) {
            LOGGER.severe("Error saving user list: " + e.getMessage());
        }
    }

    private String getFileName(String userType) {
        if (userType.equalsIgnoreCase("user")) {
            return "users.txt";
        } else if (userType.equalsIgnoreCase("store owner")) {
            return "owners.txt";
        } else if (userType.equalsIgnoreCase("supplier")) {
            return "suppliers.txt";
        } else {
            LOGGER.warning("Invalid user type: " + userType);
            return null;
        }
    }

    private boolean userExists(ArrayList<User> userList, String username, String email) {
        for (User user : userList) {
            if (user.getUsername().equals(username) || user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    private void editUser(ArrayList<User> userList, User updatedUser) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(updatedUser.getUsername()) ||
                userList.get(i).getEmail().equals(updatedUser.getEmail())) {
                userList.set(i, updatedUser);
                break;
            }
        }
    }

    private void deleteUser(ArrayList<User> userList, String username, String email) {
        userList.removeIf(user -> user.getUsername().equals(username) || user.getEmail().equals(email));
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new AccountsFrame().setVisible(true));
    }

    public String getMessage() {
        return message;
    }

    public javax.swing.JTextField getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(javax.swing.JTextField userNameField) {
        this.userNameField = userNameField;
    }

    public javax.swing.JTextField getEmailField() {
        return emailField;
    }

    public void setEmailField(javax.swing.JTextField emailField) {
        this.emailField = emailField;
    }

    public javax.swing.JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(javax.swing.JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public javax.swing.JTextField getCityField() {
        return cityField;
    }

    public void setCityField(javax.swing.JTextField cityField) {
        this.cityField = cityField;
    }

    public JComboBox<String> getSelectedUserType() {
        return userTypeComboBox;
    }

    public JComboBox<String> getSelectedActionType() {
        return actionTypeComboBox;
    }

    public void setUserTypeComboBox(javax.swing.JComboBox<String> userTypeComboBox) {
        this.userTypeComboBox = userTypeComboBox;
    }

    public void setActionTypeComboBox(javax.swing.JComboBox<String> actionTypeComboBox) {
        this.actionTypeComboBox = actionTypeComboBox;
    }
}
