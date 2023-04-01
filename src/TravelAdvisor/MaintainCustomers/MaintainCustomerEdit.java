package TravelAdvisor.MaintainCustomers;

import TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaintainCustomerEdit extends JFrame {

    private JPanel maintaincustomereditPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton logoutButton;
    private JButton backButton;
    private JButton saveButton;

    public MaintainCustomerEdit() {
        //Displays the Travel Advisor Maintain customer Edit page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Travel Advisor Generate Report");
        this.setContentPane(maintaincustomereditPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user is taken back to main manager page
                dispose();
                TravelAdvisorMaintainCustomers travelAdvisorMaintainCustomers = new TravelAdvisorMaintainCustomers();
                travelAdvisorMaintainCustomers.setVisible(true);
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
