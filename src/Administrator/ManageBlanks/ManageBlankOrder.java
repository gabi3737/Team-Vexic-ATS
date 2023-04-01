package Administrator.ManageBlanks;

import Administrator.MainPage.AdministratorMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageBlankOrder extends JFrame {


    private JPanel manageorderPanel;
    private JButton backButton;
    private JButton saveButton;
    private JButton logoutButton;
    private JComboBox comboBox1;

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
                //Allows the user to go back to Administrator manage blank page
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
