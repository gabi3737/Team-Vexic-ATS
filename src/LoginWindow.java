import Administrator.MainPage.AdministratorMain;
import Manager.MainPage.ManagerMain;
import TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame {
    private JButton ExitButton;
    private JPanel loginPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton LoginButton;
    private JLabel TeamLogo;
    private JLabel UsernameLabel;
    private JLabel PasswordLabel;
    private JButton administratorButtonTestButton;
    private JButton managerButtonTestButton;
    private JButton travelAdvisorButtonTestButton;

    public LoginWindow() {

        ImageIcon originalIcon = new ImageIcon("Images/AppLogo2.png");
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, -1, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        TeamLogo.setIcon(scaledIcon);
        TeamLogo.setSize(100, 100);
        TeamLogo.setBorder(new EmptyBorder(40, 40, 40, 80));

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //AdministratorMain administratorMain = new AdministratorMain();
                //administratorMain.setVisible(true);
                //dispose();

                //ManagerMain managerMain = new ManagerMain();
                //managerMain.setVisible(true);
                //dispose();
            }
        });

        administratorButtonTestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdministratorMain administratorMain = new AdministratorMain();
                administratorMain.setVisible(true);
                dispose();
            }
        });

        managerButtonTestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerMain managerMain = new ManagerMain();
                managerMain.setVisible(true);
                dispose();
            }
        });

        travelAdvisorButtonTestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TravelAdvisorMain travelAdvisorMain = new TravelAdvisorMain();
                travelAdvisorMain.setVisible(true);
                dispose();
            }
        });

        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        LoginWindow loginWindow = new LoginWindow();
        loginWindow.setVisible(true);
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginWindow.setSize(1000,800);
        loginWindow.setTitle("Vexic");
        loginWindow.setContentPane(loginWindow.loginPanel);
        loginWindow.setLocationRelativeTo(null);
    }
}
