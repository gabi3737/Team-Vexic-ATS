package Administrator.ManageBlanks;

import Administrator.MainPage.AdministratorMain;
import Administrator.ManageAdvisors.AdministratorManageAdvisor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton saveButton;

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
             * Implementation of ActionEvent to allow the user to go back to the Administrator main page
             * @param e
             */
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
                //when pressed the software closes
                dispose();
            }
        });

    }
}
