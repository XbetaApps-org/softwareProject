package com.software.ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OwnerIndex extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private static final Logger LOGGER = Logger.getLogger(OwnerIndex.class.getName());

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                OwnerIndex frame = new OwnerIndex();
                frame.setVisible(true);
            } catch (Exception e) {
                // Log the exception instead of printing the stack trace
                LOGGER.log(Level.SEVERE, "An error occurred while launching the OwnerIndex frame", e);
            }
        });
    }

    /**
     * Create the frame.
     */
    public OwnerIndex() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Use static access with "WindowConstants" for "EXIT_ON_CLOSE"
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
    }
}
