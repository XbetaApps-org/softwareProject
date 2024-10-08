package com.software.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FeedBackManageFrame extends javax.swing.JFrame {

    private static final String FONT_SEGOE_UI = "Segoe UI";
    private static final String ERROR_TITLE = "Error";
    private static final String FEEDBACK_FILE = "feedBacks.txt";
    
    private javax.swing.JTextArea feedbackArea;

    public FeedBackManageFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        javax.swing.JPanel feedbackPanel = new javax.swing.JPanel();
        javax.swing.JLabel titleLabel = new javax.swing.JLabel();
        javax.swing.JScrollPane feedbackScrollPane = new javax.swing.JScrollPane();
        feedbackArea = new javax.swing.JTextArea();
        javax.swing.JButton backToHomeButton = new javax.swing.JButton();
        javax.swing.JPanel headerPanel = new javax.swing.JPanel();
        javax.swing.JLabel appNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feedbackPanel.setBackground(new java.awt.Color(38, 25, 38));

        titleLabel.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 24));
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("FeedBacks");

        feedbackArea.setBackground(new java.awt.Color(0, 0, 0));
        feedbackArea.setColumns(20);
        feedbackArea.setFont(new java.awt.Font(FONT_SEGOE_UI, 0, 14));
        feedbackArea.setForeground(new java.awt.Color(255, 255, 255));
        feedbackArea.setRows(5);
        feedbackScrollPane.setViewportView(feedbackArea);

        backToHomeButton.setBackground(new java.awt.Color(153, 0, 0));
        backToHomeButton.setFont(new java.awt.Font(FONT_SEGOE_UI, 1, 15));
        backToHomeButton.setForeground(new java.awt.Color(102, 255, 102));
        backToHomeButton.setText("Back To Home");
        backToHomeButton.addActionListener(this::handleBackToHomeButton);

        javax.swing.GroupLayout feedbackPanelLayout = new javax.swing.GroupLayout(feedbackPanel);
        feedbackPanel.setLayout(feedbackPanelLayout);
        feedbackPanelLayout.setHorizontalGroup(
            feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(feedbackPanelLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(feedbackScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(feedbackPanelLayout.createSequentialGroup()
                            .addComponent(backToHomeButton)
                            .addGap(103, 103, 103)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)))
                    .addContainerGap(174, Short.MAX_VALUE))
        );
        feedbackPanelLayout.setVerticalGroup(
            feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(feedbackPanelLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(feedbackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(backToHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(feedbackScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(92, Short.MAX_VALUE))
        );

        headerPanel.setBackground(new java.awt.Color(168, 215, 153));
        headerPanel.setForeground(new java.awt.Color(255, 255, 255));

        appNameLabel.setFont(new java.awt.Font("Segoe Script", 1, 24));
        appNameLabel.setForeground(new java.awt.Color(26, 54, 50));
        appNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appNameLabel.setText("Art Of Baking");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(304, 304, 304))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(appNameLabel)
                    .addGap(15, 15, 15))
        );

        loadFeedbackFromFile(FEEDBACK_FILE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(feedbackPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(feedbackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void handleBackToHomeButton(java.awt.event.ActionEvent evt) {
        Index index = new Index();
        index.setVisible(true);
        this.dispose();
    }

    private void loadFeedbackFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder feedbackContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                feedbackContent.append(line).append("\n");
            }
            feedbackArea.setText(feedbackContent.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading feedback from file: " + e.getMessage(),
                                          ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FeedBackManageFrame().setVisible(true));
    }
}
