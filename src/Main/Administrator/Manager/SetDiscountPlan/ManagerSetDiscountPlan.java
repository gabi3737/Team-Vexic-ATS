package Main.Administrator.Manager.SetDiscountPlan;

import Main.Administrator.Manager.MainPage.ManagerMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A class that holds the functionality of managing discount plans, by adding new ones or editing existing ones
 */
public class ManagerSetDiscountPlan extends JFrame {

    private JPanel managersetdiscountplanPanel;
    private JButton editDiscountPlanButton;
    private JButton addDiscountPlanButton;
    private JButton logoutButton;
    private JButton backButton;

    /**
     * Displays the Main.Administrator.Manager Set Discount Plan page
     */
    public ManagerSetDiscountPlan() {
        //Displays the Main.Administrator.Manager Set Discount Plan page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Main.Administrator.Manager Set Discount Plan");
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
            /**
             * when pressed user the user is taken back to Set Discount Plan Main.Administrator.Manager page
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                //when pressed user the user is taken back to Set Discount Plan Main.Administrator.Manager page
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
