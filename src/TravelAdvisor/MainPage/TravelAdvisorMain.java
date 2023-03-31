package TravelAdvisor.MainPage;

import TravelAdvisor.GenerateReports.TravelAdvisorGenerateReport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelAdvisorMain extends JFrame {

    private JPanel traveladvisormainPanel;
    private JButton generateReportButton;
    private JButton maintainCustomersButton;
    private JButton sellTicketButton;
    private JButton issueRefundButton;
    private JButton logoutButton;

    public TravelAdvisorMain() {
        //Allows the Travel Advisor Main page to be shown
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manager");
        this.setContentPane(traveladvisormainPanel);
        this.setLocationRelativeTo(null);

        generateReportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TravelAdvisorGenerateReport travelAdvisorGenerateReport = new TravelAdvisorGenerateReport();
                travelAdvisorGenerateReport.setVisible(true);
                dispose();
            }
        });
    }
}
