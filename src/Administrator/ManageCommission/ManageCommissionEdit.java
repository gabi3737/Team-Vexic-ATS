package Administrator.ManageCommission;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class to creat Graphical User Interface
 * It holds the functionality of editing an existing commission rates details
 */
public class ManageCommissionEdit extends JFrame {

    private JPanel managecommissioneditPanel;
    private JComboBox comboBox1;
    private JButton backButton;
    private JButton saveButton;
    private JButton logoutButton;

    /**
     * Displays the Manage Commissions Add page
     */
    public ManageCommissionEdit(){
        //Displays the Manage Commissions Add page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Commission Edit");
        this.setContentPane(managecommissioneditPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Allows the user to go back to Administrator manage commissions page
                dispose();
                AdministratorManageCommission administratorManageCommission = new AdministratorManageCommission();
                administratorManageCommission.setVisible(true);
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
