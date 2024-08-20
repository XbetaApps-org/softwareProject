package com.software.ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class NonAdminIndex extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                NonAdminIndex frame = new NonAdminIndex();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace(); // Make sure this debug feature is deactivated before delivering the code in production.
            }
        });
    }

    /**
     * Create the frame.
     */
    public NonAdminIndex() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Use static access with "WindowConstants" for "EXIT_ON_CLOSE"
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
    }
}
