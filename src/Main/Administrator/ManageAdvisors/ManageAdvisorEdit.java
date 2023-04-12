package Main.Administrator.ManageAdvisors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of editing the details of an existing travel advisors account
 */
public class ManageAdvisorEdit extends JFrame{
    private JPanel editPanel;
    private JTextField idField;
    private JTextField passwordField;
    private JComboBox accounttypeField;
    private JTextField usernameField;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;

    /**
     * Displays the Add new page from Manage Advisors
     */
    public ManageAdvisorEdit() {
        //Displays the Add new page from Manage Advisors
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Advisors Edit");
        this.setContentPane(editPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            /**
             * Implementation of ActionEvent to allow the user to go back to the Manage advisors main page
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to the Manage advisors main page
                dispose();
                AdministratorManageAdvisor administratorManageAdvisors = new AdministratorManageAdvisor();
                administratorManageAdvisors.setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //when this button is pressed the application is turned off.
                dispose();
            }
        });

    }
}
