package Administrator.ManageCommission;

import Administrator.MainPage.AdministratorMain;
import Administrator.ManageBlanks.AdministratorManageBlanks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds the functionality of managing the commission rate, for example, adding, deleting or editing a commission rate
 */
public class AdministratorManageCommission extends JFrame {

    private JPanel managecommissionPanel;
    private JButton addCommissionButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton logoutButton;
    private JButton backButton;
    private JButton saveButton;

    /**
     * Displays the Manage Commissions page
     */
    public  AdministratorManageCommission() {
        //Displays the Manage Commissions page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Commission");
        this.setContentPane(managecommissionPanel);
        this.setLocationRelativeTo(null);

        addCommissionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageCommissionAdd manageCommissionAdd = new ManageCommissionAdd();
                manageCommissionAdd.setVisible(true);
                dispose();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageCommissionEdit manageCommissionEdit = new ManageCommissionEdit();
                manageCommissionEdit.setVisible(true);
                dispose();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to Administrator manage blank page
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
