package Main.Administrator.ManageCommission;

import Main.Administrator.LoginWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface that holds the functionality of adding a new commission rate
 */
public class ManageCommissionAdd extends JFrame {

    private JPanel managecommissionaddPanel;
    private JTextField textField1;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;

    /**
     * Displays the Manage Commissions Add page
     */
    public ManageCommissionAdd(){
        //Displays the Manage Commissions Add page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Commission Add");
        this.setContentPane(managecommissionaddPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            /**
             * An override method to allow the user to go back to Main.Administrator manage commissions page
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to Main.Administrator manage commissions page
                dispose();
                AdministratorManageCommission administratorManageCommission = new AdministratorManageCommission();
                administratorManageCommission.setVisible(true);
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
