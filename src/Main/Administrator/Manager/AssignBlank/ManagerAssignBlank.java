package Main.Administrator.Manager.AssignBlank;

import Main.Administrator.DatabaseConnector;
import Main.Administrator.LoginWindow;
import Main.Administrator.Manager.MainPage.ManagerMain;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds the functionality of the manager assigning a quantity of blanks to an advisors
 */
public class ManagerAssignBlank extends JFrame {

    private JPanel managerassignblankPanel;
    private JTextField advisorName;
    private JTextField blankQnt;
    private JButton logoutButton;
    private JButton saveButton;
    private JButton backButton;
    private JTextField startBlank;
    private JButton viewAllAssignedBlanksButton;

    /**
     * Displays the Assign Blank Page
     */
    public ManagerAssignBlank() {
        //Displays the Assign Blank Page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Main.Administrator.Manager Assign Blank");
        this.setContentPane(managerassignblankPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            /**
             * An override method, when pressed the user is taken back to the main manager page
             * @param e the event to be processed
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

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long firstBlank = Long.parseLong(startBlank.getText());
                long lastBlank = firstBlank + Long.parseLong(blankQnt.getText()) - 1;
                JOptionPane.showMessageDialog(null,firstBlank + "," + lastBlank);
                DatabaseConnector.assignBlanks(firstBlank,lastBlank,advisorName.getText());
            }
        });

        viewAllAssignedBlanksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DatabaseConnector.displayAssignedBlanks();
            }
        });
    }
}
