import Main.Administrator.MainPage.AdministratorMain;
import Main.Administrator.Manager.MainPage.ManagerMain;
import Main.Administrator.TravelAdvisor.MainPage.TravelAdvisorMain;
import Main.Administrator.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface of Login Page
 * It holds the functionality of the login window displayed to users
 */
public class LoginWindow extends JFrame {
    private JButton ExitButton;
    private JPanel loginPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton LoginButton;
    private JLabel TeamLogo;
    private JButton administratorButtonTestButton;
    private JButton managerButtonTestButton;
    private JButton travelAdvisorButtonTestButton;


    /**
     * Displays the login window page to the user
     */
    public LoginWindow() {
        /** The App Logo added */
        ImageIcon originalIcon = new ImageIcon("Images/AirViaLogo.png");
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, -1, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        TeamLogo.setIcon(scaledIcon);
        TeamLogo.setSize(100, 100);
        TeamLogo.setBorder(new EmptyBorder(40, 40, 40, 80));

        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                AdministratorMain administratorMain = new AdministratorMain();
//                administratorMain.setVisible(true);
//                dispose();
//
//                ManagerMain managerMain = new ManagerMain();
//                managerMain.setVisible(true);
//                dispose();
                System.out.println(textField1.getText());
                DatabaseConnector.connect(textField1.getText(),textField2.getText());
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



    /**
     * The main method for the Login page
     * Login window size by width and height specified
     *
     * @param args arguments
     */

    public static void main(String[] args) {
        LoginWindow loginWindow = new LoginWindow();
        loginWindow.setVisible(true);
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginWindow.setSize(1000, 800);
        loginWindow.setTitle("Vexic");
        loginWindow.setContentPane(loginWindow.loginPanel);
        loginWindow.setLocationRelativeTo(null);
    }
}

