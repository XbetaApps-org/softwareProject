import com.software.ui.WelcomeFrame;

public class Main {
    public static void main(String[] args) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame().setVisible(true);
            }
        });
    }
}