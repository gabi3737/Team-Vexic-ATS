package Manager.SetDiscountPlan;

import Manager.MainPage.ManagerMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetDiscountPlanEdit extends JFrame {

    private JPanel setdiscountplaneditPanel;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton deleteButton;
    private JButton backButton;
    private JButton logoutButton;
    private JButton saveButton;

    public SetDiscountPlanEdit() {
        //Displays the Manager Set Discount Edit Page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manager Set Discount Plan Edit");
        this.setContentPane(setdiscountplaneditPanel);
        this.setLocationRelativeTo(null);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user the user is taken back to Set Discount Plan Manager page
                dispose();
                ManagerSetDiscountPlan managerSetDiscountPlan = new ManagerSetDiscountPlan();
                managerSetDiscountPlan.setVisible(true);
                dispose();
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
