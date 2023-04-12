package TravelAdvisor.IssueRefund;

import TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *  A class that holds the functionality of issuing a refund to a customer
 */
public class TravelAdvisorIssueRefund extends JFrame {

    private JPanel traveladvisorissuerefundPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;

    /**
     * Displays the Travel Advisor Issue Refund page
     */
    public TravelAdvisorIssueRefund() {
        //Displays the Travel Advisor Issue Refund page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Travel Advisor Issue Refund");
        this.setContentPane(traveladvisorissuerefundPanel);
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
