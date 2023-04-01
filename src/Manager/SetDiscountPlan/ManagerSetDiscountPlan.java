package Manager.SetDiscountPlan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerSetDiscountPlan extends JFrame {

    private JPanel managersetdiscountplanPanel;
    private JButton editDiscountPlanButton;
    private JButton addDiscountPlanButton;
    private JButton logoutButton;
    private JButton backButton;

    public ManagerSetDiscountPlan() {
        //Displays the Manager Set Discount Plan page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manager Set Discount Plan");
        this.setContentPane(managersetdiscountplanPanel);
        this.setLocationRelativeTo(null);

        editDiscountPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetDiscountPlanEdit setDiscountPlanEdit = new SetDiscountPlanEdit();
                setDiscountPlanEdit.setVisible(true);
                dispose();
            }
        });

        addDiscountPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SetDiscountPlanAdd setDiscountPlanAdd = new SetDiscountPlanAdd();
                setDiscountPlanAdd.setVisible(true);
                dispose();
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user the user is taken back to Set Discount Plan Manager page
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
