package com.software.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class SignUpFrame extends javax.swing.JFrame {

    private static final String FONT_ARABIC_FIXED = "Simplified Arabic Fixed";
    private static final String ERROR_TITLE = "Error";

    public SignUpFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PasswordConfirmField = new javax.swing.JPasswordField();
        PasswordField = new javax.swing.JPasswordField();
        SignUpButton = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new java.awt.Color(38, 25, 38));
        jPanel2.setBackground(new java.awt.Color(168, 153, 15));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 54, 50));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Art Of Baking");
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3.setBackground(new java.awt.Color(38, 25, 38));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SignUp page");
        userNameField.setBackground(new java.awt.Color(204, 255, 255));
        userNameField.setForeground(new java.awt.Color(0, 0, 0));
        userNameField.addActionListener(evt -> userNameFieldActionPerformed(evt));
        jLabel1.setFont(new java.awt.Font(FONT_ARABIC_FIXED, 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        EmailField.setBackground(new java.awt.Color(204, 255, 255));
        EmailField.setForeground(new java.awt.Color(0, 0, 0));
        EmailField.addActionListener(evt -> EmailFieldActionPerformed(evt));
        jLabel4.setFont(new java.awt.Font(FONT_ARABIC_FIXED, 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");
        jLabel5.setFont(new java.awt.Font(FONT_ARABIC_FIXED, 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jLabel6.setFont(new java.awt.Font(FONT_ARABIC_FIXED, 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm Password");
        PasswordConfirmField.setBackground(new java.awt.Color(153, 255, 255));
        PasswordConfirmField.setForeground(new java.awt.Color(0, 0, 0));
        SignUpButton.setBackground(new java.awt.Color(51, 102, 255));
        SignUpButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        SignUpButton.setForeground(new java.awt.Color(255, 255, 255));
        SignUpButton.setText("SignUp");
        SignUpButton.addActionListener(evt -> SignUpButtonActionPerformed(evt));
        
        JLabel jLabel4_1 = new JLabel();
        jLabel4_1.setText("City");
        jLabel4_1.setForeground(Color.WHITE);
        jLabel4_1.setFont(new Font(FONT_ARABIC_FIXED, Font.BOLD, 14));
        
        CityField = new JTextField();
        CityField.setForeground(Color.BLACK);
        CityField.setBackground(new Color(204, 255, 255));
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(239)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(27)
                            .addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EmailField, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(27)
                                    .addComponent(userNameField, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CityField, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                .addGroup(Alignment.TRAILING, jPanel3Layout.createParallelGroup(Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(SignUpButton, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                                    .addGap(24)))))
                    .addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(PasswordConfirmField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                        .addComponent(PasswordField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                    .addGap(50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(userNameField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGap(50)
                    .addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(EmailField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                           .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordConfirmField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(49)
                            .addGroup(jPanel3Layout.createParallelGroup(Alignment.BASELINE)
                                .addComponent(jLabel4_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addComponent(CityField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addGap(26))
                        .addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addComponent(SignUpButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                            .addGap(26))))
        );
        jPanel3.setLayout(jPanel3Layout);
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
    }

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = userNameField.getText();
        String password = new String(PasswordField.getPassword());
        String confirmPassword = new String(PasswordConfirmField.getPassword());
        String email = EmailField.getText();
        String city = CityField.getText();
        String USERS_FILE = "users.txt";

        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match", ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
            message = "Passwords do not match";
            return;
        }

        boolean userExists = userExists(USERS_FILE, username, email);
        if (userExists) {
            JOptionPane.showMessageDialog(this, "User already exists", ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
            message = "User already exists";
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Invalid email format", ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
            message = "Invalid email format";
        } else {
            String hashedPassword = hashPassword(password);
            // Append new user to the file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
                bw.write(username + " " + email + " " + hashedPassword + " " + city);
                bw.newLine();
                WelcomeFrame welcomeFrame = new WelcomeFrame();
                welcomeFrame.setVisible(true);
                this.dispose();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean userExists(String fileName, String username, String email) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 3) {
                    if (parts[0].equals(username) || parts[1].equals(email)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    private void PasswordConfirmFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new SignUpFrame().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JTextField EmailField;
    private javax.swing.JPasswordField PasswordConfirmField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField userNameField;
    private String message;
    private javax.swing.JTextField CityField;
    // End of variables declaration

    public void setUserNameField(String username) {
        this.userNameField.setText(username);
    }

    public void setPasswordField(String password) {
        this.PasswordField.setText(password);
    }

    public void setConfirmPasswordField(String confirmPassword) {
        this.PasswordConfirmField.setText(confirmPassword);
    }

    public void setEmailField(String email) {
        this.EmailField.setText(email);
    }

    public String getMessage() {
        return this.message;
    }

    public void signUp() {
        SignUpButtonActionPerformed(null);
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

