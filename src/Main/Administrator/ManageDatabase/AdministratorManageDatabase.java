package Main.Administrator.ManageDatabase;

import Main.Administrator.MainPage.AdministratorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of managing the database, such as backup, restore and fix database
 */
public class AdministratorManageDatabase extends JFrame {


    private JPanel admanagedatabasePanel;
    private JButton backupButton;
    private JButton restoreButton;
    private JButton fixDatabaseButton;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;

    /**
     * Displays the ManageDatabase page for the user
     */
    public AdministratorManageDatabase() {
        //Displays the ManageDatabase page for the user
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Database");
        this.setContentPane(admanagedatabasePanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            /**
             * An override method used
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
            /**
             * Implementation of ActionEvent where the user will be logged out and exited here if the button is pressed.
             * @param e event
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //The user will be logged out and exited here if the button is pressed.
                dispose();
            }
        });



    }
}
