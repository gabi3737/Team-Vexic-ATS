package Administrator.ManageDatabase;

import Administrator.MainPage.AdministratorMain;

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
    private JButton saveButton;
    private JButton logoutButton;

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
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to Administrator main page
                dispose();
                AdministratorMain administratorMain = new AdministratorMain();
                administratorMain.setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //The user will be logged out and exited here if the button is pressed.
                dispose();
            }
        });



    }
}
