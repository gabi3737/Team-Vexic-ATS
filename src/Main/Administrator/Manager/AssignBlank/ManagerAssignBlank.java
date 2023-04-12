package Main.Administrator.Manager.AssignBlank;

import Main.Administrator.Manager.MainPage.ManagerMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds the functionality of the manager assigning a quantity of blanks to an advisors
 */
public class ManagerAssignBlank extends JFrame {

    private JPanel managerassignblankPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton logoutButton;
    private JButton backButton;
    private JButton saveButton;

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
                //Allows the user to close the software
                dispose();
            }
        });

    }
}
