package Main.Administrator.TravelAdvisor.SellTicket;

import Main.Administrator.TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of selling a ticket to a customer
 */
public class TravelAdvisorSellTicket extends JFrame {

    private JPanel traveladvisorsellticketPanel;
    private JTextField textField1;
    private JTextField textField3;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;
    private JTextField textField4;
    private JComboBox comboBox1;

    /**
     * Displays the Travel Advisor Sell Ticket page
     */
    public TravelAdvisorSellTicket() {
        //Displays the Travel Advisor Sell Ticket page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Travel Advisor Sell Ticket");
        this.setContentPane(traveladvisorsellticketPanel);
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
