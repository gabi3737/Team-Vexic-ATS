package Main.Administrator.TravelAdvisor.MaintainCustomers;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *  A class that holds the functionality of creating a new customer account
 */
public class MaintainCustomerCreateNew extends JFrame {

    private JPanel maintaincustomercreatenewPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
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
                //Allows the user to close the software
                dispose();
            }
        });
    }
}
