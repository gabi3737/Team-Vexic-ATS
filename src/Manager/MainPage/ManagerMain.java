package Manager.MainPage;

import Manager.GenerateReports.ManagerGenerateReport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerMain extends JFrame {

    private JPanel managermainPanel;
    private JButton generateReportsButton;
    private JButton assignBlankButton;
    private JButton setDiscountPlanButton;
    private JButton logoutButton;

    public ManagerMain() {
        //Displays the main page of Manager
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Administrator");
        this.setContentPane(managermainPanel);
        this.setLocationRelativeTo(null);

        generateReportsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerGenerateReport managerGenerateReport = new ManagerGenerateReport();
                managerGenerateReport.setVisible(true);
                dispose();
            }
        });

    }
}
