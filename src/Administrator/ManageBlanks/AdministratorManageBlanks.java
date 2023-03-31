package Administrator.ManageBlanks;

import Administrator.MainPage.AdministratorMain;
import Administrator.ManageAdvisors.AdministratorManageAdvisor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorManageBlanks extends JFrame {


    private JPanel manageblankPanel;
    private JButton replaceBlanksButton;
    private JButton orderBlanksButton;
    private JButton updateBlankStatusButton;
    private JButton logoutButton;
    private JButton backButton;
    private JButton saveButton;

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
                //when pressed the software closes
                dispose();
            }
        });

    }
}
