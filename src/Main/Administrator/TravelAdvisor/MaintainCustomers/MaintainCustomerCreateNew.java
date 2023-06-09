package Main.Administrator.TravelAdvisor.MaintainCustomers;

import Main.Administrator.DatabaseConnector;
import Main.Administrator.LoginWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *  A class that holds the functionality of creating a new customer account
 */
public class MaintainCustomerCreateNew extends JFrame {

    private JPanel maintaincustomercreatenewPanel;
    private JTextField customerID;
    private JTextField customerName;
    private JTextField address;
    private JComboBox customerType;
    private JComboBox DiscountPlan;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;

    /**
     * Displays the Travel Advisor Maintain Customer Create New page
     */
    public MaintainCustomerCreateNew() {
        //Displays the Travel Advisor Maintain Customer Create New page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Travel Advisor Maintain Customer Create New");
        this.setContentPane(maintaincustomercreatenewPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            /**
             * when pressed user is taken back to main manager page
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user is taken back to main manager page
                dispose();
                TravelAdvisorMaintainCustomers travelAdvisorMaintainCustomers = new TravelAdvisorMaintainCustomers();
                travelAdvisorMaintainCustomers.setVisible(true);
                dispose();
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

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseConnector.InsertSQL(
                        "INSERT INTO Customer(customerID, customerType, eligibleForDiscount, address, name, discountRate, TravelAgencyID, AdvisoradvisorID, DiscountPlandiscountID) " +
                                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                        customerID.getText(), customerType.getSelectedItem().toString(), "yes", address.getText(), customerName.getText(), 0.12f, 123456, 250, 1111
                );
            }
        });


    }
}
