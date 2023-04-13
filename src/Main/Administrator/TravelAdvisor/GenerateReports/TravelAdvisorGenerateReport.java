package Main.Administrator.TravelAdvisor.GenerateReports;

import Main.Administrator.LoginWindow;
import Main.Administrator.TravelAdvisor.MainPage.TravelAdvisorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of generating one of the following reports, Ticket stock turnover report, domestic report or individual report
 */
public class TravelAdvisorGenerateReport extends JFrame {

    private JPanel traveladvisorgeneratereportPanel;
    private JButton generateTicketStockTurnoverButton;
    private JButton generateDomesticReportButton;
    private JButton generateInternationalRpoertButton;
    private JButton logoutButton;
    private JButton backButton;

    /**
     * Allows the Travel Advisor Generate Report Page
     */
    public TravelAdvisorGenerateReport() {
        //Allows the Travel Advisor Generate Report Page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Travel Advisor Generate Report");
        this.setContentPane(traveladvisorgeneratereportPanel);
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
