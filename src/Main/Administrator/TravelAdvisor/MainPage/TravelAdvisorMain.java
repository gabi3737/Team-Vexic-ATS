package Main.Administrator.TravelAdvisor.MainPage;

import Main.Administrator.LoginWindow;
import Main.Administrator.TravelAdvisor.GenerateReports.TravelAdvisorGenerateReport;
import Main.Administrator.TravelAdvisor.IssueRefund.TravelAdvisorIssueRefund;
import Main.Administrator.TravelAdvisor.MaintainCustomers.TravelAdvisorMaintainCustomers;
import Main.Administrator.TravelAdvisor.SellTicket.TravelAdvisorSellTicket;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds all the information of the travel advisor
 */
public class TravelAdvisorMain extends JFrame {

    private JPanel traveladvisormainPanel;
    private JButton generateReportButton;
    private JButton maintainCustomersButton;
    private JButton sellTicketButton;
    private JButton issueRefundButton;
    private JButton logoutButton;

    /**
     * Allows the Travel Advisor Main page to be shown
     */
    public TravelAdvisorMain() {
        //Allows the Travel Advisor Main page to be shown
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Travel Advisor");
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

        maintainCustomersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TravelAdvisorMaintainCustomers travelAdvisorMaintainCustomers = new TravelAdvisorMaintainCustomers();
                travelAdvisorMaintainCustomers.setVisible(true);
                dispose();
            }
        });

        sellTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TravelAdvisorSellTicket travelAdvisorSellTicket = new TravelAdvisorSellTicket();
                travelAdvisorSellTicket.setVisible(true);
                dispose();
            }
        });

        issueRefundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TravelAdvisorIssueRefund travelAdvisorIssueRefund = new TravelAdvisorIssueRefund();
                travelAdvisorIssueRefund.setVisible(true);
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
    }
}
