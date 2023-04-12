package Main.Administrator.Manager.SetDiscountPlan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of adding a new discount plan.
 */
public class SetDiscountPlanAdd extends JFrame {

    private JPanel setdiscountplanaddPanel;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton logoutButton;
    private JButton saveButton;
    private JButton backButton;

    /**
     * Displays the Set Discount Plan Add page for Main.Administrator.Manager
     */
    public SetDiscountPlanAdd() {
        //Displays the Set Discount Plan Add page for Main.Administrator.Manager
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Main.Administrator.Manager Set Discount Plan Add");
        this.setContentPane(setdiscountplanaddPanel);
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
                //Allows the user to close the software
                dispose();
            }
        });
    }

}
