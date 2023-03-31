package TravelAdvisor.GenerateReports;

import Manager.MainPage.ManagerMain;
import TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelAdvisorGenerateReport extends JFrame {

    private JPanel traveladvisorgeneratereportPanel;
    private JButton generateTicketStockTurnoverButton;
    private JButton generateDomesticReportButton;
    private JButton generateInternationalReportButton;
    private JButton logoutButton;
    private JButton backButton;

    public TravelAdvisorGenerateReport() {
        //Allows the Travel Advisor Generate Report Page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manager");
        this.setContentPane(traveladvisorgeneratereportPanel);
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
