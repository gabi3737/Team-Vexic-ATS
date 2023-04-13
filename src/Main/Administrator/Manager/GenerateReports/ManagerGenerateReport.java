package Main.Administrator.Manager.GenerateReports;

import Main.Administrator.Manager.MainPage.ManagerMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of generating a report
 */
public class ManagerGenerateReport extends JFrame {

    private JPanel managergeneratereportPanel;
    private JButton generateGlobalDomesticSalesButton;
    private JButton generateGlobalINterlinesSalesButton;
    private JButton logoutButton;
    private JButton backButton;

    /**
     * Displays the Generate Reports page from Main.Administrator.Manager,
     * for example, a global domestic sales report or a global interlines sales report
     */
    public ManagerGenerateReport() {
        //Displays the Generate Reports page from Main.Administrator.Manager
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Main.Administrator.Manager Generate Reports");
        this.setContentPane(managergeneratereportPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            /**
             * implementation of ActionEvent
             * when pressed user is taken back to main manager page
             * @param e event
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user is taken back to main manager page
                dispose();
                ManagerMain managerMain = new ManagerMain();
                managerMain.setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            /**
             * implementation of ActionEvent
             * it allows the user to close the system
             * @param e event
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to close the software
                dispose();
            }
        });


    }
}
