package Main.Administrator.ManageBlanks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of replacing the blanks of a travel advisor.
 */
public class ManageReplaceBlanks extends JFrame {


    private JPanel replaceblanksPanel;
    private JTextField textField1;
    private JButton deleteBlankButton;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton saveButton;
    private JButton logoutButton;
    private JButton backButton;

    /**
     * Displays the Manage Replace blanks main page
     */
    public ManageReplaceBlanks() {
        //Displays the Manage Replace blanks main page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setTitle("Manage Blanks Replace Blanks");
        this.setContentPane(replaceblanksPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to Manage blank main page
                dispose();
                AdministratorManageBlanks administratorManageBlanks = new AdministratorManageBlanks();
                administratorManageBlanks.setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            /**
             * An override method of ActionEvent Implementation
             * when pressed the system closes
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed the software closes
                dispose();
            }
        });
    }
}
