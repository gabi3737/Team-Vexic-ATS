package Administrator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorMain extends JFrame {


    private JPanel administratorPanel;
    private JButton manageDatabaseButton;
    private JButton manageAdvisorsButton;
    private JButton manageBlankButton;
    private JButton manageCommissionsButton;
    private JButton logoutButton;

    public AdministratorMain() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Administrator");
        this.setContentPane(administratorPanel);
        this.setLocationRelativeTo(null);

        manageDatabaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdministratorManageDatabase administratorManageDatabase = new AdministratorManageDatabase();
                administratorManageDatabase.setVisible(true);
                dispose();
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
