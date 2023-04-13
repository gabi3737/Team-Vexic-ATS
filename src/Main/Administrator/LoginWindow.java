package Main.Administrator;

import Main.Administrator.MainPage.AdministratorMain;
import Main.Administrator.Manager.MainPage.ManagerMain;
import Main.Administrator.TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface of Login Page
 * It holds the functionality of the login window displayed to users
 * @author Team Vexic
 * @version 1.5
 * @since 1.0
 */
public class LoginWindow extends JFrame {
    private JButton ExitButton;
    public JPanel loginPanel;
    private JTextField user;
    private JTextField pass;
    private JButton LoginButton;
    private JLabel TeamLogo;
    private JButton administratorButtonTestButton;
    private JButton managerButtonTestButton;
    private JButton travelAdvisorButtonTestButton;


    /**
     * Displays the login window page to the user
     */
    public LoginWindow() {
        /** The App Logo added
         * Logo sized width and height specified
         * border specified
         */
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
                System.out.println(user.getText() + ", " + pass.getText());
                if (DatabaseConnector.QueryMatches("SELECT * FROM Login WHERE username = ? AND password = ?",user.getText(), pass.getText()))
                {
                    System.out.println("logged in as: " + user.getText());
                    String userRole = DatabaseConnector.getUserDesignation(user.getText());
                    System.out.println(userRole);
                    if (userRole.equals("Travel Advisor")){
                        TravelAdvisorMain travelAdvisorMain = new TravelAdvisorMain();
                        travelAdvisorMain.setVisible(true);
                        dispose();
                    }
                    else if (userRole.equals("Sales Agent")){
                        ManagerMain managerMain = new ManagerMain();
                        managerMain.setVisible(true);
                        dispose();
                    }
                    else if (userRole.equals("Manager")){
                        ManagerMain managerMain = new ManagerMain();
                        managerMain.setVisible(true);
                        dispose();
                    }
                    else if (userRole.equals("Administrator")){
                        AdministratorMain administratorMain = new AdministratorMain();
                        administratorMain.setVisible(true);
                        dispose();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error logging in. Please check your credentials.");
                    System.out.println("Error logging in");
                }
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

        DatabaseConnector.connect("in2018g28_a","dxPL33CI");
        //DatabaseConnector.connect("in2018g28_d", "BC7F1Qxr");
    }
}

