package Administrator.ManageAdvisors;

import Administrator.MainPage.AdministratorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorManageAdvisor extends JFrame {


    private JPanel administratormanageadvisorsPanel;
    private JTextField textField1;
    private JButton logoutButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton backButton;
    private JButton saveButton;
    private JButton addNewButton;

    public AdministratorManageAdvisor() {
        //Displays the First Administrator page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Advisors");
        this.setContentPane(administratormanageadvisorsPanel);
        this.setLocationRelativeTo(null);

        addNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageAdvisorAddNew manageAdvisorAddNew = new ManageAdvisorAddNew();
                manageAdvisorAddNew.setVisible(true);
                dispose();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageAdvisorEdit manageAdvisorEdit = new ManageAdvisorEdit();
                manageAdvisorEdit.setVisible(true);
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
                dispose();
            }
        });
    }

}
