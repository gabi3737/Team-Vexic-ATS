package Main.Administrator.Manager.MainPage;

import Main.Administrator.Manager.AssignBlank.ManagerAssignBlank;
import Main.Administrator.Manager.GenerateReports.ManagerGenerateReport;
import Main.Administrator.Manager.SetDiscountPlan.ManagerSetDiscountPlan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface that holds all the information of the manager
 */
public class ManagerMain extends JFrame {

    private JPanel managermainPanel;
    private JButton generateReportsButton;
    private JButton assignBlankButton;
    private JButton setDiscountPlanButton;
    private JButton logoutButton;

    /**
     * Displays the main page of Main.Administrator.Manager
     */
    public ManagerMain() {
        //Displays the main page of Main.Administrator.Manager
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manager");
        this.setContentPane(managermainPanel);
        this.setLocationRelativeTo(null);

        generateReportsButton.addActionListener(new ActionListener() {
            /**
             * Implementation of ActionEvent
             * When button is pressed the Main.Administrator.Manager is taken to the Generate Report page
             * @param e event
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //When button is pressed the Main.Administrator.Manager is taken to the Generate Report page
                ManagerGenerateReport managerGenerateReport = new ManagerGenerateReport();
                managerGenerateReport.setVisible(true);
                dispose();
            }
        });

        assignBlankButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerAssignBlank managerAssignBlank = new ManagerAssignBlank();
                managerAssignBlank.setVisible(true);
                dispose();
            }
        });

        setDiscountPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerSetDiscountPlan managerSetDiscountPlan = new ManagerSetDiscountPlan();
                managerSetDiscountPlan.setVisible(true);
                dispose();
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            /**
             * An ActionEvent added
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Closes the software when pressed
                dispose();
            }
        });

    }
}
