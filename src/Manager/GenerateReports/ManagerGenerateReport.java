package Manager.GenerateReports;

import Administrator.ManageAdvisors.AdministratorManageAdvisor;
import Manager.MainPage.ManagerMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of generating a report
 */
public class ManagerGenerateReport extends JFrame {

    private JPanel managergeneratereportPanel;
    private JButton generateGlobalDomesticSalesButton;
    private JButton generateGlobalInterlinesSalesButton;
    private JButton logoutButton;
    private JButton backButton;

    /**
     * Displays the Generate Reports page from Manager, for example, a global domestic sales report or a global interlines sales report
     */
    public ManagerGenerateReport() {
        //Displays the Generate Reports page from Manager
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manager Generate Reports");
        this.setContentPane(managergeneratereportPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user is taken back to main manager page
                dispose();
                ManagerMain managerMain = new ManagerMain();
                managerMain.setVisible(true);
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
