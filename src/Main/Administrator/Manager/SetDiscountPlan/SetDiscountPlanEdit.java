package Main.Administrator.Manager.SetDiscountPlan;

import Main.Administrator.LoginWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of editing an existing discount plan
 */
public class SetDiscountPlanEdit extends JFrame {

    private JPanel setdiscountplaneditPanel;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;

    /**
     * Displays the Main.Administrator.Manager Set Discount Edit Page
     */
    public SetDiscountPlanEdit() {
        //Displays the Main.Administrator.Manager Set Discount Edit Page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Main.Administrator.Manager Set Discount Plan Edit");
        this.setContentPane(setdiscountplaneditPanel);
        this.setLocationRelativeTo(null);


        backButton.addActionListener(new ActionListener() {
            /**
             * when pressed user the user is taken back to Set Discount Plan Main.Administrator.Manager page
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user the user is taken back to Set Discount Plan Main.Administrator.Manager page
                dispose();
                ManagerSetDiscountPlan managerSetDiscountPlan = new ManagerSetDiscountPlan();
                managerSetDiscountPlan.setVisible(true);

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
    }
}
