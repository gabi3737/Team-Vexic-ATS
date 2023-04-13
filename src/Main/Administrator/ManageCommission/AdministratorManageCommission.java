package Main.Administrator.ManageCommission;

import Main.Administrator.LoginWindow;
import Main.Administrator.MainPage.AdministratorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds the functionality of managing the commission rate, for example, adding, deleting or editing a commission rate
 */
public class AdministratorManageCommission extends JFrame {

    private JPanel managecommissionPanel;
    private JButton deleteButton;
    private JButton addCommissionButton;
    private JButton editButton;
    private JButton logoutButton;
    private JButton backButton;

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
                //Allows the user to go back to Main.Administrator manage blank page
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
    }
}
