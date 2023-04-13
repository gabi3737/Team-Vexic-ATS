package Main.Administrator.MainPage;

import Main.Administrator.LoginWindow;
import Main.Administrator.ManageAdvisors.AdministratorManageAdvisor;
import Main.Administrator.ManageBlanks.AdministratorManageBlanks;
import Main.Administrator.ManageCommission.AdministratorManageCommission;
import Main.Administrator.ManageDatabase.AdministratorManageDatabase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface for Main Administrator page
 * It holds all the information of the Main.Administrator
 * @author Team Vexic
 * @version 1.5
 * @since 1.0
 */
public class AdministratorMain extends JFrame {


    private JPanel administratorPanel;
    private JButton manageDatabaseButton;
    private JButton manageAdvisorsButton;
    private JButton manageBlankButton;
    private JButton manageCommissionsButton;
    private JButton logoutButton;

    /**
     * Displays the First Main.Administrator page
     * window size width and height specified
     */
    public AdministratorMain() {
        //Displays the First Main.Administrator page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Administrator");
        this.setContentPane(administratorPanel);
        this.setLocationRelativeTo(null);

        manageDatabaseButton.addActionListener(new ActionListener() {
            /**
             * Implementation of ActionEvent
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Displays ManageDatabase page when pressed
                AdministratorManageDatabase administratorManageDatabase = new AdministratorManageDatabase();
                administratorManageDatabase.setVisible(true);
                dispose();
            }
        });

        manageAdvisorsButton.addActionListener(new ActionListener() {
            /**
             * An Override method to display ManageAdvisors page when pressed
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Displays ManageAdvisors page when pressed
                AdministratorManageAdvisor administratorManageAdvisors = new AdministratorManageAdvisor();
                administratorManageAdvisors.setVisible(true);
                dispose();
            }
        });

        manageBlankButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdministratorManageBlanks administratorManageBlanks = new AdministratorManageBlanks();
                administratorManageBlanks.setVisible(true);
                dispose();

            }
        });

        manageCommissionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdministratorManageCommission administratorManageCommission = new AdministratorManageCommission();
                administratorManageCommission.setVisible(true);
                dispose();
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginWindow loginWindow = new LoginWindow();
                loginWindow.setVisible(true);
                loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                loginWindow.setSize(1000, 800);
                loginWindow.setTitle("Vexic");
                loginWindow.setContentPane(loginWindow.loginPanel);
                loginWindow.setLocationRelativeTo(null);
                dispose();
            }
        });


    }
}
