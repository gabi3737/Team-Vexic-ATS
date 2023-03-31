package Administrator.MainPage;

import Administrator.ManageAdvisors.AdministratorManageAdvisor;
import Administrator.ManageBlanks.AdministratorManageBlanks;
import Administrator.ManageCommission.AdministratorManageCommission;
import Administrator.ManageDatabase.AdministratorManageDatabase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorMain extends JFrame {


    private JPanel administratorPanel;
    private JButton manageDatabaseButton;
    private JButton manageAdvisorsButton;
    private JButton manageBlankButton;
    private JButton manageCommissionsButton;
    private JButton logoutButton;

    public AdministratorMain() {
        //Displays the First Administrator page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Administrator");
        this.setContentPane(administratorPanel);
        this.setLocationRelativeTo(null);

        manageDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Displays ManageDatabase page when pressed
                AdministratorManageDatabase administratorManageDatabase = new AdministratorManageDatabase();
                administratorManageDatabase.setVisible(true);
                dispose();
            }
        });

        manageAdvisorsButton.addActionListener(new ActionListener() {
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
                dispose();
            }
        });


    }
}
