package Main.Administrator.ManageBlanks;

import Main.Administrator.LoginWindow;
import Main.Administrator.MainPage.AdministratorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Administrator.DatabaseConnector.displayBlankTable;

/**
 * A class that holds the functionality of managing blanks, such as replacing, ordering or updating blanks
 */
public class AdministratorManageBlanks extends JFrame {


    private JPanel manageblankPanel;
    private JButton replaceBlanksButton;
    private JButton orderBlanksButton;
    private JButton updateBlankStatusButton;
    private JButton logoutButton;
    private JButton backButton;
    private JButton viewAllButton;

    /**
     * Displays the Manage Blanks page
     */
    public AdministratorManageBlanks() {
        //Displays the Manage Blanks page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setTitle("Manage Blanks");
        this.setContentPane(manageblankPanel);
        this.setLocationRelativeTo(null);

        replaceBlanksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageReplaceBlanks manageReplaceBlanks = new ManageReplaceBlanks();
                manageReplaceBlanks.setVisible(true);
                dispose();
            }
        });

        orderBlanksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageBlankOrder manageBlankOrder = new ManageBlankOrder();
                manageBlankOrder.setVisible(true);
                dispose();
            }
        });

        updateBlankStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageUpdateBlankStatus manageUpdateBlankStatus = new ManageUpdateBlankStatus();
                manageUpdateBlankStatus.setVisible(true);
                dispose();
            }
        });


        backButton.addActionListener(new ActionListener() {
            /**
             * Implementation of ActionEvent to allow the user to go back to the Main.Administrator main page
             * @param e event
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to Main.Administrator main page
                dispose();
                AdministratorMain administratorMain = new AdministratorMain();
                administratorMain.setVisible(true);
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

        viewAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayBlankTable();
            }
        });

    }
}
