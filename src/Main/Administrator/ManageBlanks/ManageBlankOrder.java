package Main.Administrator.ManageBlanks;

import Main.Administrator.DatabaseConnector;
import Main.Administrator.LoginWindow;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds the functionality of ordering blanks by type
 */
public class ManageBlankOrder extends JFrame {


    private JPanel manageorderPanel;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;
    private JTextField travelAgencyName;
    private JTextField date;
    private JTextField blankAmt;
    private JComboBox blankType;

    /**
     * Displays the Manage Blank Order
     */
    public ManageBlankOrder() {
        //Displays the Manage Blank Order
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setTitle("Manage Blanks Order Blanks");
        this.setContentPane(manageorderPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to Main.Administrator manage blank page
                dispose();
                AdministratorManageBlanks administratorManageBlanks = new AdministratorManageBlanks();
                administratorManageBlanks.setVisible(true);
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
                long startBlankNum = Long.parseLong(blankType.getSelectedItem().toString()) * 100000000L + 1;
                long endBlankNum = startBlankNum +  Long.parseLong(blankAmt.getText()) -1;
                DatabaseConnector.insertBlankRange(travelAgencyName.getText(), date.getText(), startBlankNum, endBlankNum);
                /*
                DatabaseConnector.insertBlankRange("AirVia", "01/04/2019", 44400000001L, 44400000100L);
                DatabaseConnector.insertBlankRange("AirVia", "08/05/2019", 42000000001L, 42000000100L);
                DatabaseConnector.insertBlankRange("AirVia", "03/06/2019", 20100000001L, 20100000100L);
                DatabaseConnector.insertBlankRange("AirVia", "09/07/2019", 10100000001L, 10100000050L);
                 */
            }
        });
    }
}
