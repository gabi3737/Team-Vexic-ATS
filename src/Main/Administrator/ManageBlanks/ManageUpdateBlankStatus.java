package Main.Administrator.ManageBlanks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds the functionality of updating the status of a blank, for example updating a cancelled blank to "void"
 */
public class ManageUpdateBlankStatus extends JFrame {

    private JPanel updateBlankStatus;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton logoutButton;
    private JButton saveButton;
    private JButton backButton;

    /**
     * Displays the Manage Update Blank Status page
     */
    public ManageUpdateBlankStatus() {
        //Displays the Manage Update Blank Status page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 800);
        this.setTitle("Manage Blanks Update Blank Status");
        this.setContentPane(updateBlankStatus);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            /**
             * Implementation of ActionEvent to allow the user to go back to the Main.Administrator manage blank page
             * @param e
             */
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
