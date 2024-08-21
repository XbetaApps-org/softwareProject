package com.software.ui;

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class UserIndex extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(UserIndex.class.getName());
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                UserIndex frame = new UserIndex();
                frame.setVisible(true);
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "An error occurred while launching the UserIndex frame", e);  // Replaced printStackTrace with logging
            }
        });
    }

    /**
     * Create the frame.
     */
    public UserIndex() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Use static access with "WindowConstants" for "EXIT_ON_CLOSE"
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
    }
}
