package com.software.ui;

public class Index extends javax.swing.JFrame {

    // Define a constant for the "Segoe UI" font
    private static final String FONT_SEGOE_UI = "Segoe UI";
    
    private javax.swing.JButton accountsButton;
    private javax.swing.JButton contentManagementButton;
    private javax.swing.JButton feedbackButton;
    private javax.swing.JButton reportsButton;
    private javax.swing.JButton statisticsButton;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel buttonPanel;

    public Index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();

        feedbackButton = new javax.swing.JButton();
        accountsButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        statisticsButton = new javax.swing.JButton();
        contentManagementButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(168, 215, 153));

        titleLabel.setFont(new java.awt.Font("Segoe Script", 1, 24)); 
        titleLabel.setForeground(new java.awt.Color(26, 54, 50));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Art Of Baking");

        adminLabel.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 24)); 
        adminLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminLabel.setText("ADMIN");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminLabel)
                .addGap(18, 18, 18))
        );

        buttonPanel.setBackground(new java.awt.Color(38, 25, 38));

        feedbackButton.setBackground(new java.awt.Color(153, 0, 0));
        feedbackButton.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 14)); 
        feedbackButton.setForeground(new java.awt.Color(102, 255, 102));
        feedbackButton.setText("FeedBack");
        feedbackButton.addActionListener(evt -> handleFeedbackButton(evt));

        accountsButton.setBackground(new java.awt.Color(153, 0, 0));
        accountsButton.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 14)); 
        accountsButton.setForeground(new java.awt.Color(102, 255, 102));
        accountsButton.setText("Accounts");
        accountsButton.addActionListener(evt -> handleAccountsButton(evt));

        reportsButton.setBackground(new java.awt.Color(153, 0, 0));
        reportsButton.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 14)); 
        reportsButton.setForeground(new java.awt.Color(102, 255, 102));
        reportsButton.setText("Reports");
        reportsButton.addActionListener(evt -> handleReportsButton(evt));

        statisticsButton.setBackground(new java.awt.Color(153, 0, 0));
        statisticsButton.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 14)); 
        statisticsButton.setForeground(new java.awt.Color(102, 255, 102));
        statisticsButton.setText("Statistics");
        statisticsButton.addActionListener(evt -> handleStatisticsButton(evt));

        contentManagementButton.setBackground(new java.awt.Color(153, 0, 0));
        contentManagementButton.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 14)); 
        contentManagementButton.setForeground(new java.awt.Color(102, 255, 102));
        contentManagementButton.setText("Content Management");
        contentManagementButton.addActionListener(evt -> handleContentManagementButton(evt));

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(feedbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(accountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(statisticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(contentManagementButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feedbackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statisticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(contentManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void handleFeedbackButton(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        FeedBackManageFrame feedbackManageFrame = new FeedBackManageFrame();
        feedbackManageFrame.setVisible(true);
    }                                              

    private void handleAccountsButton(java.awt.event.ActionEvent evt) {                                               
        this.setVisible(false);
        AccountsFrame accountsFrame = new AccountsFrame();
        accountsFrame.setVisible(true);
    }                                              

    private void handleReportsButton(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void handleStatisticsButton(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void handleContentManagementButton(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Index().setVisible(true);
        });
    }
}
