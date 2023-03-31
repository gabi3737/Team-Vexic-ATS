package TravelAdvisor.MaintainCustomers;

import TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelAdvisorMaintainCustomers extends JFrame {

    private JPanel traveladvisormaintaincustomerPanel;
    private JButton createNewButton;
    private JTextField textField1;
    private JButton editButton;
    private JButton deleteButton;
    private JButton logoutButton;
    private JButton backButton;
    private JButton saveButton;

    public TravelAdvisorMaintainCustomers() {
        //Displays the Travel Advisor Maintain Customer page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Travel Advisor Maintain Customer");
        this.setContentPane(traveladvisormaintaincustomerPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
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
                //Allows the user to close the software
                dispose();
            }
        });
    }
}