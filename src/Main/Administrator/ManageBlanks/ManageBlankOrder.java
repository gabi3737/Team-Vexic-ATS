package Main.Administrator.ManageBlanks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds the functionality of ordering blanks by type
 */
public class ManageBlankOrder extends JFrame {


    private JPanel manageorderPanel;
    private JButton backButton;
    private JButton saveButton;
    private JButton logoutButton;
    private JComboBox comboBox1;

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
                //when pressed the software closes
                dispose();
            }
        });
    }
}
