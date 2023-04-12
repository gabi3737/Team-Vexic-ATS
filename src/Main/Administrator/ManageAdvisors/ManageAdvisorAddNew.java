package Main.Administrator.ManageAdvisors;

import Main.Administrator.DatabaseConnector;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * A class to creat Graphical User Interface
 * It holds the functionality of adding a new travel advisor account
 */
public class ManageAdvisorAddNew extends JFrame {


    private JPanel addnewPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton backButton;
    private JButton saveButton;
    private JButton logoutButton;
    private JTextField textField4;
    private JComboBox comboBox1;

    /**
     * Displays the Add new page from Manage Advisors
     */
    public ManageAdvisorAddNew() {
        //Displays the Add new page from Manage Advisors
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Advisors AddNew");
        this.setContentPane(addnewPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdministratorManageAdvisor administratorManageAdvisors = new AdministratorManageAdvisor();
                administratorManageAdvisors.setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rand = 100 + (int) (Math.random() * 899) ;
                DatabaseConnector.InsertSQL("INSERT INTO Employee (employeeID, name, designation, TravelAgencyID) VALUES (?, ?, ?, ?)",
                        "EMP" + rand, textField4.getText(), "Travel Advisor", 123456);
                DatabaseConnector.InsertSQL("INSERT INTO Advisor (advisorID, EmployeeemployeeID) VALUES (?, ?)",
                        textField2.getText(), "EMP" + rand);
                DatabaseConnector.InsertSQL("INSERT INTO Login (loginID, username, password, email, EmployeeemployeeID) VALUES (?, ?, ?, ?, ?)",
                        textField2.getText(), textField1.getText(), textField3.getText(), textField1.getText() + textField2.getText() + "@airvia.mail.uk", "EMP" + rand);
                /*
                DatabaseConnector.InsertSQL("INSERT INTO Advisor (advisorID, EmployeeemployeeID) \n" +
                        "VALUES (" + textField2.getText() + ", EMP" + rand + "); \n" );
                DatabaseConnector.InsertSQL("INSERT INTO Login (loginID, username, password, email, EmployeeemployeeID) \n" +
                        "VALUES (" + textField2.getText() + ", " + textField1.getText() + ", " + textField3.getText() + ", " + textField1.getText()+textField2.getText() + "@airvia.mail.uk" + ", EMP" + rand  + "); \n");

                 */
            }
        });

    }

}
