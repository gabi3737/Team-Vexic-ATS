package Administrator.ManageBlanks;

import Administrator.MainPage.AdministratorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageReplaceBlanks extends JFrame {


    private JPanel replaceblanksPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton deleteBlankButton;
    private JButton logoutButton;
    private JButton backButton;
    private JButton saveButton;

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
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed the software closes
                dispose();
            }
        });
    }
}
