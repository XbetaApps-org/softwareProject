/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.software.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Khatib
 */
public class StoreOwnerFrame extends javax.swing.JFrame {

    /**
     * Creates new form StoreOwnerFrame
     */
    public StoreOwnerFrame() {
        initComponents();
    }
    boolean b = true;
    String name = "Owner";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        OwnerTabbedPane = new javax.swing.JTabbedPane();
        WelcomePanel = new javax.swing.JPanel();
        UserManagementPanel = new javax.swing.JPanel();
        UserManageTools = new javax.swing.JPanel();
        ManageAccLabel = new javax.swing.JLabel();
        UserMngUsernameTxt = new javax.swing.JTextField();
        UserMngPasswordTxt = new javax.swing.JTextField();
        UserMngEmailTxt = new javax.swing.JTextField();
        UserMngCityTxt = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        CityLabel = new javax.swing.JLabel();
        OkButton = new javax.swing.JButton();
        SolidLineLabel = new javax.swing.JLabel();
        ProductsPanel = new javax.swing.JPanel();
        ProductsTools = new javax.swing.JPanel();
        ProductsLabel = new javax.swing.JLabel();
        SolidLineLabel1 = new javax.swing.JLabel();
        OkBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        StoreOwnerProdNameTxt = new javax.swing.JTextField();
        UsernameLabel1 = new javax.swing.JLabel();
        PasswordLabel1 = new javax.swing.JLabel();
        StoreOwnerProdPriceTxt = new javax.swing.JTextField();
        OrdersPanel = new javax.swing.JPanel();
        ProductsTools2 = new javax.swing.JPanel();
        ProductsLabel2 = new javax.swing.JLabel();
        SolidLineLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ProductComboBox = new javax.swing.JComboBox<>();
        SupplierComboBox = new javax.swing.JComboBox<>();
        CommunicationPanel = new javax.swing.JPanel();
        ProductsTools1 = new javax.swing.JPanel();
        ProductsLabel1 = new javax.swing.JLabel();
        SolidLineLabel2 = new javax.swing.JLabel();
        RecipientL = new javax.swing.JLabel();
        MessageL = new javax.swing.JLabel();
        RecipientT = new javax.swing.JTextField();
        MessageT = new javax.swing.JTextField();
        SendMsgT = new javax.swing.JButton();
        SupplierBtnsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MngAccountBtn = new javax.swing.JButton();
        ProductsBtn = new javax.swing.JButton();
        OrdersBtn = new javax.swing.JButton();
        CommunicationBtn = new javax.swing.JButton();
        NotificationsBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        WelcomeOwnerLabel = new javax.swing.JLabel();
        CakeImage = new javax.swing.JLabel();
        CE121Label = new javax.swing.JLabel();
        BackgroundPanel = new javax.swing.JPanel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OwnerTabbedPane.setBackground(new java.awt.Color(255, 255, 255,0));

        WelcomePanel.setBackground(new java.awt.Color(255, 255, 255,0));

        javax.swing.GroupLayout WelcomePanelLayout = new javax.swing.GroupLayout(WelcomePanel);
        WelcomePanel.setLayout(WelcomePanelLayout);
        WelcomePanelLayout.setHorizontalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        WelcomePanelLayout.setVerticalGroup(
            WelcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );

        OwnerTabbedPane.addTab("tab4", WelcomePanel);

        UserManagementPanel.setBackground(new java.awt.Color(255, 255, 255,0));

        UserManageTools.setBackground(new java.awt.Color(153, 153, 153,180));

        ManageAccLabel.setBackground(new java.awt.Color(0, 0, 0));
        ManageAccLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ManageAccLabel.setForeground(new java.awt.Color(0, 0, 0));
        ManageAccLabel.setText("Manage Account");

        UserMngUsernameTxt.setBackground(new java.awt.Color(255, 255, 255));
        UserMngUsernameTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserMngUsernameTxt.setForeground(new java.awt.Color(0, 0, 0));

        UserMngPasswordTxt.setBackground(new java.awt.Color(255, 255, 255));
        UserMngPasswordTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserMngPasswordTxt.setForeground(new java.awt.Color(0, 0, 0));

        UserMngEmailTxt.setBackground(new java.awt.Color(255, 255, 255));
        UserMngEmailTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserMngEmailTxt.setForeground(new java.awt.Color(0, 0, 0));

        UserMngCityTxt.setBackground(new java.awt.Color(255, 255, 255));
        UserMngCityTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserMngCityTxt.setForeground(new java.awt.Color(0, 0, 0));

        UsernameLabel.setBackground(new java.awt.Color(0, 0, 0));
        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        UsernameLabel.setText("Username:");

        EmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(0, 0, 0));
        EmailLabel.setText("Email:");

        PasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        PasswordLabel.setText("Password:");

        CityLabel.setBackground(new java.awt.Color(0, 0, 0));
        CityLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CityLabel.setForeground(new java.awt.Color(0, 0, 0));
        CityLabel.setText("City:");

        OkButton.setBackground(new java.awt.Color(23, 93, 163));
        OkButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        OkButton.setForeground(new java.awt.Color(0, 0, 0));
        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        SolidLineLabel.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\Images\\Line.png")); // NOI18N

        javax.swing.GroupLayout UserManageToolsLayout = new javax.swing.GroupLayout(UserManageTools);
        UserManageTools.setLayout(UserManageToolsLayout);
        UserManageToolsLayout.setHorizontalGroup(
            UserManageToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserManageToolsLayout.createSequentialGroup()
                .addGroup(UserManageToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserManageToolsLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(ManageAccLabel))
                    .addGroup(UserManageToolsLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(UserManageToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(UserManageToolsLayout.createSequentialGroup()
                                .addComponent(UsernameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UserMngUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UserManageToolsLayout.createSequentialGroup()
                                .addComponent(EmailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UserMngEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104)
                        .addGroup(UserManageToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(UserManageToolsLayout.createSequentialGroup()
                                .addComponent(CityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UserMngCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UserManageToolsLayout.createSequentialGroup()
                                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UserMngPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(UserManageToolsLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(SolidLineLabel)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserManageToolsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        UserManageToolsLayout.setVerticalGroup(
            UserManageToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserManageToolsLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(ManageAccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolidLineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(UserManageToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserMngPasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserMngUsernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(UserManageToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserMngCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserMngEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(OkButton)
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout UserManagementPanelLayout = new javax.swing.GroupLayout(UserManagementPanel);
        UserManagementPanel.setLayout(UserManagementPanelLayout);
        UserManagementPanelLayout.setHorizontalGroup(
            UserManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserManagementPanelLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(UserManageTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        UserManagementPanelLayout.setVerticalGroup(
            UserManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserManagementPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(UserManageTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        OwnerTabbedPane.addTab("tab1", UserManagementPanel);

        ProductsPanel.setBackground(new java.awt.Color(255, 255, 255,0));

        ProductsTools.setBackground(new java.awt.Color(153, 153, 153,180));

        ProductsLabel.setBackground(new java.awt.Color(0, 0, 0));
        ProductsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProductsLabel.setForeground(new java.awt.Color(0, 0, 0));
        ProductsLabel.setText("Products");

        SolidLineLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\Images\\Line.png")); // NOI18N

        OkBtn.setBackground(new java.awt.Color(43, 82, 126));
        OkBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        OkBtn.setForeground(new java.awt.Color(0, 0, 0));
        OkBtn.setText("Ok");
        OkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBtnActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add", "Edit", "Delete" }));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Allergic");
        jCheckBox1.setToolTipText("");

        StoreOwnerProdNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        StoreOwnerProdNameTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StoreOwnerProdNameTxt.setForeground(new java.awt.Color(0, 0, 0));

        UsernameLabel1.setBackground(new java.awt.Color(0, 0, 0));
        UsernameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        UsernameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        UsernameLabel1.setText("Name:");

        PasswordLabel1.setBackground(new java.awt.Color(0, 0, 0));
        PasswordLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        PasswordLabel1.setForeground(new java.awt.Color(0, 0, 0));
        PasswordLabel1.setText("Price:");

        StoreOwnerProdPriceTxt.setBackground(new java.awt.Color(255, 255, 255));
        StoreOwnerProdPriceTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StoreOwnerProdPriceTxt.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ProductsToolsLayout = new javax.swing.GroupLayout(ProductsTools);
        ProductsTools.setLayout(ProductsToolsLayout);
        ProductsToolsLayout.setHorizontalGroup(
            ProductsToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsToolsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(UsernameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StoreOwnerProdNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(PasswordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StoreOwnerProdPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addGroup(ProductsToolsLayout.createSequentialGroup()
                .addGroup(ProductsToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductsToolsLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(SolidLineLabel1))
                    .addGroup(ProductsToolsLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(ProductsLabel))
                    .addGroup(ProductsToolsLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jCheckBox1))
                    .addGroup(ProductsToolsLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(ProductsToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        ProductsToolsLayout.setVerticalGroup(
            ProductsToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsToolsLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(ProductsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolidLineLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(ProductsToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StoreOwnerProdPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StoreOwnerProdNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OkBtn)
                .addGap(118, 118, 118))
        );

        javax.swing.GroupLayout ProductsPanelLayout = new javax.swing.GroupLayout(ProductsPanel);
        ProductsPanel.setLayout(ProductsPanelLayout);
        ProductsPanelLayout.setHorizontalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsPanelLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(ProductsTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        ProductsPanelLayout.setVerticalGroup(
            ProductsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(ProductsTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        OwnerTabbedPane.addTab("tab2", ProductsPanel);

        OrdersPanel.setBackground(new java.awt.Color(255, 255, 255,0));

        ProductsTools2.setBackground(new java.awt.Color(153, 153, 153,180));

        ProductsLabel2.setBackground(new java.awt.Color(0, 0, 0));
        ProductsLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProductsLabel2.setForeground(new java.awt.Color(0, 0, 0));
        ProductsLabel2.setText("Orders");

        SolidLineLabel3.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\Images\\Line.png")); // NOI18N

        jButton1.setBackground(new java.awt.Color(23, 93, 163));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Make Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(23, 93, 163));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Show Orders");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ProductComboBox.setBackground(new java.awt.Color(255, 255, 255));
        ProductComboBox.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ProductComboBox.setForeground(new java.awt.Color(0, 0, 0));
        ProductComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        SupplierComboBox.setBackground(new java.awt.Color(255, 255, 255));
        SupplierComboBox.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SupplierComboBox.setForeground(new java.awt.Color(0, 0, 0));
        SupplierComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        SupplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductsTools2Layout = new javax.swing.GroupLayout(ProductsTools2);
        ProductsTools2.setLayout(ProductsTools2Layout);
        ProductsTools2Layout.setHorizontalGroup(
            ProductsTools2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsTools2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(SolidLineLabel3)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsTools2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ProductsTools2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsTools2Layout.createSequentialGroup()
                        .addComponent(ProductsLabel2)
                        .addGap(338, 338, 338))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductsTools2Layout.createSequentialGroup()
                        .addGroup(ProductsTools2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(SupplierComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProductComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(278, 278, 278))))
        );
        ProductsTools2Layout.setVerticalGroup(
            ProductsTools2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsTools2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(ProductsLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolidLineLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(57, 57, 57)
                .addComponent(SupplierComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OrdersPanelLayout = new javax.swing.GroupLayout(OrdersPanel);
        OrdersPanel.setLayout(OrdersPanelLayout);
        OrdersPanelLayout.setHorizontalGroup(
            OrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrdersPanelLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(ProductsTools2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        OrdersPanelLayout.setVerticalGroup(
            OrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrdersPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(ProductsTools2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        OwnerTabbedPane.addTab("tab2", OrdersPanel);

        CommunicationPanel.setBackground(new java.awt.Color(255, 255, 255,0));

        ProductsTools1.setBackground(new java.awt.Color(153, 153, 153,180));

        ProductsLabel1.setBackground(new java.awt.Color(0, 0, 0));
        ProductsLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProductsLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ProductsLabel1.setText("Communication");

        SolidLineLabel2.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\Images\\Line.png")); // NOI18N

        RecipientL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        RecipientL.setForeground(new java.awt.Color(0, 0, 0));
        RecipientL.setText("Recipient :");

        MessageL.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        MessageL.setForeground(new java.awt.Color(0, 0, 0));
        MessageL.setText("Message :");

        RecipientT.setBackground(new java.awt.Color(255, 255, 255));
        RecipientT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MessageT.setBackground(new java.awt.Color(255, 255, 255));
        MessageT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        SendMsgT.setBackground(new java.awt.Color(23, 93, 163));
        SendMsgT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SendMsgT.setForeground(new java.awt.Color(0, 0, 0));
        SendMsgT.setText("Send Message");
        SendMsgT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendMsgTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProductsTools1Layout = new javax.swing.GroupLayout(ProductsTools1);
        ProductsTools1.setLayout(ProductsTools1Layout);
        ProductsTools1Layout.setHorizontalGroup(
            ProductsTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsTools1Layout.createSequentialGroup()
                .addGroup(ProductsTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductsTools1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(SolidLineLabel2))
                    .addGroup(ProductsTools1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(ProductsTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ProductsTools1Layout.createSequentialGroup()
                                .addComponent(RecipientL, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecipientT, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProductsTools1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ProductsTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SendMsgT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ProductsTools1Layout.createSequentialGroup()
                                        .addComponent(MessageL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MessageT))))))
                    .addGroup(ProductsTools1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(ProductsLabel1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        ProductsTools1Layout.setVerticalGroup(
            ProductsTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductsTools1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(ProductsLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolidLineLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(ProductsTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecipientL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RecipientT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(ProductsTools1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MessageT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MessageL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(SendMsgT)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CommunicationPanelLayout = new javax.swing.GroupLayout(CommunicationPanel);
        CommunicationPanel.setLayout(CommunicationPanelLayout);
        CommunicationPanelLayout.setHorizontalGroup(
            CommunicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CommunicationPanelLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(ProductsTools1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        CommunicationPanelLayout.setVerticalGroup(
            CommunicationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CommunicationPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(ProductsTools1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        OwnerTabbedPane.addTab("tab2", CommunicationPanel);

        getContentPane().add(OwnerTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -40, 1080, 840));

        SupplierBtnsPanel.setBackground(new java.awt.Color(255, 255, 255,150));
        SupplierBtnsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\Images\\circle.png")); // NOI18N
        jLabel1.setEnabled(false);
        SupplierBtnsPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 20, 30));

        MngAccountBtn.setBackground(new java.awt.Color(23, 93, 163));
        MngAccountBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MngAccountBtn.setForeground(new java.awt.Color(0, 0, 0));
        MngAccountBtn.setText("Manage Account");
        MngAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MngAccountBtnActionPerformed(evt);
            }
        });
        SupplierBtnsPanel.add(MngAccountBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 150, 257, 70));

        ProductsBtn.setBackground(new java.awt.Color(23, 93, 163));
        ProductsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ProductsBtn.setForeground(new java.awt.Color(0, 0, 0));
        ProductsBtn.setText("Products");
        ProductsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsBtnActionPerformed(evt);
            }
        });
        SupplierBtnsPanel.add(ProductsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 230, 260, 70));

        OrdersBtn.setBackground(new java.awt.Color(23, 93, 163));
        OrdersBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        OrdersBtn.setForeground(new java.awt.Color(0, 0, 0));
        OrdersBtn.setText("Orders");
        OrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersBtnActionPerformed(evt);
            }
        });
        SupplierBtnsPanel.add(OrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 310, 257, 70));

        CommunicationBtn.setBackground(new java.awt.Color(23, 93, 163));
        CommunicationBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CommunicationBtn.setForeground(new java.awt.Color(0, 0, 0));
        CommunicationBtn.setText("Communication");
        CommunicationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CommunicationBtnActionPerformed(evt);
            }
        });
        SupplierBtnsPanel.add(CommunicationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 390, 257, 70));

        NotificationsBtn.setBackground(new java.awt.Color(23, 93, 163));
        NotificationsBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NotificationsBtn.setForeground(new java.awt.Color(0, 0, 0));
        NotificationsBtn.setText("Notifications");
        NotificationsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificationsBtnActionPerformed(evt);
            }
        });
        SupplierBtnsPanel.add(NotificationsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 470, 257, 70));

        LogOutBtn.setBackground(new java.awt.Color(225, 158, 87));
        LogOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogOutBtn.setForeground(new java.awt.Color(0, 0, 0));
        LogOutBtn.setText("Logout");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });
        SupplierBtnsPanel.add(LogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 550, 257, 70));

        WelcomeOwnerLabel.setBackground(new java.awt.Color(0, 0, 0));
        WelcomeOwnerLabel.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        WelcomeOwnerLabel.setText("Welcome Owner");
        WelcomeOwnerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WelcomeOwnerLabelMouseClicked(evt);
            }
        });
        SupplierBtnsPanel.add(WelcomeOwnerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 61));

        CakeImage.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\Images\\cake (1).png")); // NOI18N
        SupplierBtnsPanel.add(CakeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 680, -1, -1));

        CE121Label.setBackground(new java.awt.Color(0, 0, 0));
        CE121Label.setFont(new java.awt.Font("Pristina", 1, 14)); // NOI18N
        CE121Label.setText("CE.121");
        SupplierBtnsPanel.add(CE121Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 730, 40, -1));

        getContentPane().add(SupplierBtnsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 800));

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255,0));

        BackgroundImage.setBackground(new java.awt.Color(23, 93, 163));
        BackgroundImage.setIcon(new javax.swing.ImageIcon("src\\main\\resources\\Images\\Background5.jpg")); // NOI18N

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BackgroundImage)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BackgroundImage)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void makeOrder() {
    String storeOwnerName = name; // Assuming 'Name' is a global variable for the Store Owner's name
    String supplierName = SupplierComboBox.getSelectedItem().toString();    //JOptionPane.showInputDialog(null, "Enter Supplier Name:", "Supplier", JOptionPane.QUESTION_MESSAGE);
    String productName = ProductComboBox.getSelectedItem().toString();  //JOptionPane.showInputDialog(null, "Enter Product Name:", "Product", JOptionPane.QUESTION_MESSAGE);
    String productCount = JOptionPane.showInputDialog(null, "Enter The count you want:", "Product", JOptionPane.QUESTION_MESSAGE);
    

    // Check if the supplier and product names are provided
    if (supplierName != null && productName != null) {
        boolean supplierExists = checkIfExists("Suppliers.txt", supplierName);
        boolean productExists = checkIfExists("SupplierProducts.txt", productName);

        if (supplierExists && productExists) {
            try {
                FileWriter fileWriter = new FileWriter("Orders.txt", true); // 'true' to append to the file
                PrintWriter printWriter = new PrintWriter(fileWriter);

                // Write the order details in the specified format
                printWriter.println(storeOwnerName + "," + supplierName + "," + productName + "," + productCount);

                printWriter.close();
                SupplierComboBox.setSelectedIndex(0);
                ProductComboBox.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Order saved successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error saving order.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            String errorMessage = "Order not saved. ";
            if (SupplierComboBox.getSelectedIndex() == 0 || ProductComboBox.getSelectedIndex() == 0) {
                errorMessage += "All fields are required. ";
                JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (!supplierExists) errorMessage += "Supplier not found. ";
            if (!productExists) errorMessage += "Product not found.";
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Order not saved. All fields are required.", "Warning", JOptionPane.WARNING_MESSAGE);
    }
}
    private boolean checkIfExists(String filename, String name) {
    File file = new File(filename);
    try {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                
                // Check if any part matches the name (ignoring case)
                for (String part : parts) {
                    if (part.trim().equalsIgnoreCase(name)) {
                        scanner.close();
                        return true;
                    }
                }
            }
        }
    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error reading file: " + filename, "Error", JOptionPane.ERROR_MESSAGE);
    }
    return false;
}
    private void handleOperation() {
    String itemName = StoreOwnerProdNameTxt.getText();
    String itemPrice = StoreOwnerProdPriceTxt.getText();
    boolean isAllergic = jCheckBox1.isSelected();
    String operation = (String) jComboBox1.getSelectedItem(); 

    File file = new File("OwnerProducts.txt");
    ArrayList<String> lines = new ArrayList<>();
    boolean itemFound = false;

    try {
        try ( // Read the existing file contents
                Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                
                if (parts[0].equals(itemName)) {
                    itemFound = true;
                    
                    if ("Edit".equals(operation)) {
                        // Edit: Replace the line with the new name and price
                        String count = JOptionPane.showInputDialog(" Enter the new count you want of the product: ");
                        line = name + "," + itemName + "," + itemPrice + "," + isAllergic + "," + count;
                        JOptionPane.showMessageDialog(null, "Item updated successfully.");
                        StoreOwnerProdNameTxt.setText(""); StoreOwnerProdPriceTxt.setText(""); jCheckBox1.setSelected(false);
                    } else if ("Delete".equals(operation)) {
                        // Delete: Do not add this line back to the list
                        JOptionPane.showMessageDialog(null, "Item deleted successfully.");
                        StoreOwnerProdNameTxt.setText(""); StoreOwnerProdPriceTxt.setText(""); jCheckBox1.setSelected(false);
                        continue;
                    }else if(StoreOwnerProdNameTxt.getText().equals("") || StoreOwnerProdPriceTxt.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Product name or price could not be empty! ", "Error", JOptionPane.ERROR_MESSAGE);            
                    }
                }   
                lines.add(line);
            }
        }

        if ("Add".equals(operation)) {
            if (itemFound) {
                JOptionPane.showMessageDialog(null, "Item already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
            else if(StoreOwnerProdNameTxt.getText().equals("") || StoreOwnerProdPriceTxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Product name or price could not be empty! ", "Error", JOptionPane.ERROR_MESSAGE);
                
            }else {
                String count = JOptionPane.showInputDialog(" Enter the count you want of the product: ");
                lines.add(name + "," + itemName + "," + itemPrice + "," + isAllergic + "," + count);
                StoreOwnerProdNameTxt.setText(""); StoreOwnerProdPriceTxt.setText(""); jCheckBox1.setSelected(false);
                JOptionPane.showMessageDialog(null, "Item added successfully.");
            }
        }else if (!itemFound && ("Edit".equals(operation) || "Delete".equals(operation))) {
            JOptionPane.showMessageDialog(null, "Item not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Write the updated list back to the file
        PrintWriter writer = new PrintWriter(new FileWriter(file));
        for (String line : lines) {
            writer.println(line);
        }
        writer.close();

    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error processing file.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void updateUser() {
        if(UserMngUsernameTxt.getText().equals("") || UserMngPasswordTxt.getText().equals("") || UserMngEmailTxt.getText().equals("") || UserMngCityTxt.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username or password or email or city cannot be empty!", null, JOptionPane.ERROR_MESSAGE);
        }
        else{
            String username = UserMngUsernameTxt.getText();
            String password = UserMngPasswordTxt.getText();
            String email = UserMngEmailTxt.getText();
            String city = UserMngCityTxt.getText();

            try {
                File file = new File("Owners.txt");
                ArrayList <String> lines = new ArrayList<>();
                boolean userFound;
                try (Scanner scanner = new Scanner(file)) {
                    userFound = false;
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] parts = line.split(",");
                        if (parts[0].equals(username)) {
                            userFound = true;
                            String oldPassword = JOptionPane.showInputDialog(null, "Please enter the old password to continue :");
                            
                            if (oldPassword != null && oldPassword.equals(parts[1])) {
                                // Update the user data
                                line = username + "," + password + "," + email + "," + city;
                                JOptionPane.showMessageDialog(null, "User info updated successfully.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Incorrect old password.", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                        lines.add(line);
                    }
                }

                if (userFound) {
                    PrintWriter writer = new PrintWriter(new FileWriter(file));
                    for (String line : lines) {
                        writer.println(line);
                    }
                    writer.close();
                } else {
                    JOptionPane.showMessageDialog(null, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    private void loadUserData() {
        String username = UserMngUsernameTxt.getText();

        try {
            File file = new File("Owners.txt");
            boolean userFound;
            try (Scanner scanner = new Scanner(file)) {
                userFound = false;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");
                    
                    if (parts[0].equals(username)) {
                        userFound = true;
                        // Fill the text fields with the corresponding data
                        UserMngPasswordTxt.setText(parts[1]);
                        UserMngEmailTxt.setText(parts[2]);
                        UserMngCityTxt.setText(parts[3]);
                        break;
                    }
                }
            }

            if (!userFound) {
                JOptionPane.showMessageDialog(null, "User not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void showOrders() {
    File file = new File("Orders.txt");
    StringBuilder data = new StringBuilder();

    try {
        Scanner scanner = new Scanner(file);
        int i = 1;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(","); 
            if(parts[0].equals(name))
            {
                // Append each item's data to the StringBuilder
                data.append("Order number ")
                    .append(i).append(" :\n").append(" ")
                    .append(parts[3]).append(" piece/'s of ").append(parts[2])
                    .append(" from ").append(parts[1])
                    .append("\n\n");
                i++;
            }
        }
        scanner.close();
        if(data.isEmpty())
            data.append("There is no orders!");   
        // Display the data in a JOptionPane
        JOptionPane.showMessageDialog(null, data.toString(), name + " Orders", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error reading file.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void sendMessage(String filename) {
        
        //MailSender ms = new MailSender();
        String recipientName = RecipientT.getText();
        String message = MessageT.getText(); 

        // Check if both recipient name and message are provided
        if (recipientName != null && !recipientName.trim().isEmpty() && message != null && !message.trim().isEmpty() && (checkIfExists("Suppliers.txt", recipientName) || checkIfExists("Users.txt", recipientName))) {
            try {
                FileWriter fileWriter = new FileWriter(filename, true); // 'true' to append to the file
                PrintWriter printWriter = new PrintWriter(fileWriter);
                printWriter.println(recipientName + "," + name + "," + message);
                printWriter.close(); 
                JOptionPane.showMessageDialog(null, "Message sent successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error sending message.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else if(!(checkIfExists("Suppliers.txt", recipientName) || checkIfExists("Users.txt", recipientName))){
            JOptionPane.showMessageDialog(null, "Recipient not found! ", "Warning", JOptionPane.WARNING_MESSAGE);

        }else {
            JOptionPane.showMessageDialog(null, "Recipient name and message are required.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void deleteLineFromFile(String filename, String lineToRemove) {
    File file = new File(filename);
    ArrayList<String> lines = new ArrayList<>();

    // Read the file and keep all lines except the one to be removed
    try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.trim().equals(lineToRemove.trim())) {
                lines.add(line);
            }
        }
        scanner.close();

        // Write the remaining lines back to the file
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for (String line : lines) {
            printWriter.println(line);
        }
        printWriter.close();

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}
    private void showNotifications() {
        File file = new File("Message_All.txt");
        StringBuilder data = new StringBuilder();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(","); 
                if(parts[0].equals(name))
                {
                    // Append each item's data to the StringBuilder
                    data.append("Message from ").append(parts[1])
                        .append(" :\n").append("  ")
                        .append(parts[2])
                        .append("\n\n");
                    deleteLineFromFile("Message_All.txt",line);
                }
            }
            scanner.close();

            // Display the data in a JOptionPane
            JOptionPane.showMessageDialog(null, data.toString(), name + " Notifications", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void printUniqueFirstNames() {
        String fileName = "Suppliers.txt";
        HashSet<String> printedNames = new HashSet<>();
        b = false;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            if ((line = br.readLine()) != null) {
                // First line is skipped
            }
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0) {
                    String firstName = parts[0];
                    if (!printedNames.contains(firstName)) {
                        printedNames.add(firstName);
                        SupplierComboBox.addItem(firstName);       
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void searchByNames() {
        String fileName = "SupplierProducts.txt";
        HashSet<String> printedNames = new HashSet<>();
        b = false;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            if ((line = br.readLine()) != null) {
                // First line is skipped
            }
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equals(SupplierComboBox.getSelectedItem())) {         
                    String Name = parts[1];
                    if (!printedNames.contains(Name)) {
                        printedNames.add(Name);
                        ProductComboBox.addItem(Name);       
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private void MngAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        OwnerTabbedPane.setSelectedIndex(1);
        UserMngUsernameTxt.setText(name);
        loadUserData();    
    }                                             

    private void ProductsBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        OwnerTabbedPane.setSelectedIndex(2); 
    }                                           

    private void OrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        OwnerTabbedPane.setSelectedIndex(3);
        if(b)
            printUniqueFirstNames();
    }                                         

    private void CommunicationBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        OwnerTabbedPane.setSelectedIndex(4);
    }                                                

    private void NotificationsBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        OwnerTabbedPane.setSelectedIndex(0);
        if(jLabel1.isEnabled())
        {
            showNotifications(); 
            jLabel1.setEnabled(false);
        }
        else
            JOptionPane.showMessageDialog(null, "There is no Notification! ");
    }                                                

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.dispose();
        new LoginFrame().setVisible(true);
    }                                         

    private void WelcomeOwnerLabelMouseClicked(java.awt.event.MouseEvent evt) {                                               
        OwnerTabbedPane.setSelectedIndex(0);
    }                                              

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        showOrders();
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        makeOrder(); 
    }                                        

    private void OkBtnActionPerformed(java.awt.event.ActionEvent evt) {                                      
        handleOperation();
    }                                     

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        updateUser();
    }                                        

    private void SendMsgTActionPerformed(java.awt.event.ActionEvent evt) {                                         
        sendMessage("Message_All.txt");
        RecipientT.setText("");
        MessageT.setText(""); 
    }                                        

    private void SupplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        ProductComboBox.removeAllItems();
        ProductComboBox.addItem("Select");
        searchByNames();
    }                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StoreOwnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreOwnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreOwnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreOwnerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreOwnerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel CE121Label;
    private javax.swing.JLabel CakeImage;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JButton CommunicationBtn;
    private javax.swing.JPanel CommunicationPanel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JLabel ManageAccLabel;
    private javax.swing.JLabel MessageL;
    private javax.swing.JTextField MessageT;
    private javax.swing.JButton MngAccountBtn;
    private javax.swing.JButton NotificationsBtn;
    private javax.swing.JButton OkBtn;
    private javax.swing.JButton OkButton;
    private javax.swing.JButton OrdersBtn;
    private javax.swing.JPanel OrdersPanel;
    private javax.swing.JTabbedPane OwnerTabbedPane;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PasswordLabel1;
    private javax.swing.JComboBox<String> ProductComboBox;
    private javax.swing.JButton ProductsBtn;
    private javax.swing.JLabel ProductsLabel;
    private javax.swing.JLabel ProductsLabel1;
    private javax.swing.JLabel ProductsLabel2;
    private javax.swing.JPanel ProductsPanel;
    private javax.swing.JPanel ProductsTools;
    private javax.swing.JPanel ProductsTools1;
    private javax.swing.JPanel ProductsTools2;
    private javax.swing.JLabel RecipientL;
    private javax.swing.JTextField RecipientT;
    private javax.swing.JButton SendMsgT;
    private javax.swing.JLabel SolidLineLabel;
    private javax.swing.JLabel SolidLineLabel1;
    private javax.swing.JLabel SolidLineLabel2;
    private javax.swing.JLabel SolidLineLabel3;
    private javax.swing.JTextField StoreOwnerProdNameTxt;
    private javax.swing.JTextField StoreOwnerProdPriceTxt;
    private javax.swing.JPanel SupplierBtnsPanel;
    private javax.swing.JComboBox<String> SupplierComboBox;
    private javax.swing.JPanel UserManageTools;
    private javax.swing.JPanel UserManagementPanel;
    private javax.swing.JTextField UserMngCityTxt;
    private javax.swing.JTextField UserMngEmailTxt;
    private javax.swing.JTextField UserMngPasswordTxt;
    private javax.swing.JTextField UserMngUsernameTxt;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel UsernameLabel1;
    public javax.swing.JLabel WelcomeOwnerLabel;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
