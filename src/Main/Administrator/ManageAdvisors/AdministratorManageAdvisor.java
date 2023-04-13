package Main.Administrator.ManageAdvisors;

import Main.Administrator.DatabaseConnector;
import Main.Administrator.LoginWindow;
import Main.Administrator.MainPage.AdministratorMain;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * A class to creat Graphical User Interface
 * It  holds the functionality of managing advisors, for example, creating a new account and editing/deleting an existing account
 */
public class AdministratorManageAdvisor extends JFrame {


    private JPanel administratormanageadvisorsPanel;
    private JButton logoutButton;
    private JButton editButton;
    private JButton backButton;
    private JButton addNewButton;
    private JTextField textField1;
    private JButton deleteButton;
    private JButton viewAllButton;
    private JButton saveButton;
    private JTable resultsTable;
    private JScrollPane tableScrollPane;

    /**
     * Displays the First Main.Administrator page
     * Widnow size height and width specified
     * Set title "Manage Advisors"
     */
    public AdministratorManageAdvisor() {
        //Displays the First Main.Administrator page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Advisors");
        this.setContentPane(administratormanageadvisorsPanel);
        this.setLocationRelativeTo(null);

        /**
         *Implementation of ActionListener
         */
        addNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageAdvisorAddNew manageAdvisorAddNew = new ManageAdvisorAddNew();
                manageAdvisorAddNew.setVisible(true);
                dispose();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DatabaseConnector.QueryMatches("SELECT e.EmployeeID FROM Employee e WHERE EmployeeID = ?", textField1.getText()))
                {
                    DatabaseConnector.tempUserID = textField1.getText();
                }
                ManageAdvisorEdit manageAdvisorEdit = new ManageAdvisorEdit();
                manageAdvisorEdit.setVisible(true);
                dispose();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DatabaseConnector.QueryMatches("SELECT e.EmployeeID FROM Employee e WHERE EmployeeID = ?", textField1.getText()))
                {
                    DatabaseConnector.tempUserID = textField1.getText();
                    DatabaseConnector.QuerySQL("DELETE * FROM Employee WHERE EmployeeID = '" + DatabaseConnector.tempUserID + "'");
                    JOptionPane.showMessageDialog(null, "Employee deleted successfully");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Employee ID does not match any in database");
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            /**
             * Implementation of ActionEvent
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to Main.Administrator main page
                dispose();
                AdministratorMain administratorMain = new AdministratorMain();
                administratorMain.setVisible(true);
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

        viewAllButton.addActionListener(new ActionListener() {
            /**
             * Implementation of ActionEvent
             * The CONNECT statement connects the system to the database server
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tableModel = DatabaseConnector.QuerySQLTable("SELECT * FROM Employee e ");
                if (tableModel != null) {
                    resultsTable.setModel(tableModel);
                }
            }
        });
    }

}
