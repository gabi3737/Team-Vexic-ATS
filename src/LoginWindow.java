import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {
    private JButton ExitButton;
    private JButton LoginButton;
    private JTextField UserTextField;
    private JLabel PasswordLabel;
    private JLabel UserLabel;
    private JTextField textField1;
    private JPanel mainPanel;

    public LoginWindow() {
        setContentPane(mainPanel);
        setTitle("Vexic");
        setSize(600,500);
        mainPanel.setBackground(Color.GREEN);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }



    public static void main(String[] args) {
        LoginWindow myFrame = new LoginWindow();
    }
}