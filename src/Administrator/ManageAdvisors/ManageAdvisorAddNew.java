package Administrator.ManageAdvisors;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageAdvisorAddNew extends JFrame {


    private JPanel addnewPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton backButton;
    private JButton saveButton;
    private JComboBox comboBox1;
    private JButton logoutButton;

    public ManageAdvisorAddNew() {
        //Displays the Add new page from Manage Advisors
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Advisors AddNew");
        this.setContentPane(addnewPanel);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                AdministratorManageAdvisor administratorManageAdvisors = new AdministratorManageAdvisor();
                administratorManageAdvisors.setVisible(true);
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }

}
