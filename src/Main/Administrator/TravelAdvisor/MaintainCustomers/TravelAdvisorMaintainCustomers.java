package Main.Administrator.TravelAdvisor.MaintainCustomers;

import Main.Administrator.LoginWindow;
import Main.Administrator.TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of managing a customer accounts, for example, creating a new account and editing/deleting an existing account
 */
public class TravelAdvisorMaintainCustomers extends JFrame {

    private JPanel traveladvisormaintaincustomerPanel;
    private JButton createNewButton;
    private JTextField textField1;
    private JButton deleteButton;
    private JButton editButton;
    private JButton logoutButton;
    private JButton backButton;
    private JButton saveButton;

    /**
     * Displays the Travel Advisor Maintain Customer page
     */
    public TravelAdvisorMaintainCustomers() {
        //Displays the Travel Advisor Maintain Customer page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Travel Advisor Maintain Customer");
        this.setContentPane(traveladvisormaintaincustomerPanel);
        this.setLocationRelativeTo(null);

        createNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MaintainCustomerCreateNew maintainCustomerCreateNew = new MaintainCustomerCreateNew();
                maintainCustomerCreateNew.setVisible(true);
                dispose();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MaintainCustomerEdit maintainCustomerEdit = new MaintainCustomerEdit();
                maintainCustomerEdit.setVisible(true);
                dispose();
            }
        });


        backButton.addActionListener(new ActionListener() {
            /**
             * when pressed user is taken back to main manager page
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user is taken back to main manager page
                dispose();
                TravelAdvisorMain travelAdvisorMain = new TravelAdvisorMain();
                travelAdvisorMain.setVisible(true);
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
