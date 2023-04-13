package Main.Administrator.ManageAdvisors;

import Main.Administrator.DatabaseConnector;
import Main.Administrator.LoginWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of editing the details of an existing travel advisors account
 */
public class ManageAdvisorEdit extends JFrame{
    private JPanel editPanel;
    //ID
    private JTextField textField1;
    //Password
    private JTextField textField2;
    //Username
    private JTextField textField3;
    //Designation (Travel Advisor, Sales Agent, Manager or Administrator)
    private JComboBox comboBox1;
    private JButton saveButton;
    private JButton backButton;
    private JButton logoutButton;

    /**
     * Displays the Add new page from Manage Advisors
     */
    public ManageAdvisorEdit() {
        //Displays the Add new page from Manage Advisors
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Advisors Edit");
        this.setContentPane(editPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            /**
             * Implementation of ActionEvent to allow the user to go back to the Manage advisors main page
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to the Manage advisors main page
                dispose();
                AdministratorManageAdvisor administratorManageAdvisors = new AdministratorManageAdvisor();
                administratorManageAdvisors.setVisible(true);
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
                String employeeID = DatabaseConnector.tempUserID;
                String username = textField3.getText();
                String password = textField2.getText();
                String designation = (String) comboBox1.getSelectedItem();

                if (!employeeID.isEmpty() && !username.isEmpty() && !password.isEmpty() && designation != null) {
                    int updatedRows = DatabaseConnector.updateEmployee(employeeID, username, password, designation);
                    if (updatedRows > 0) {
                        JOptionPane.showMessageDialog(null, "Employee details updated successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error updating employee details.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill in all the fields.");
                }
            }
        });
    }
}
