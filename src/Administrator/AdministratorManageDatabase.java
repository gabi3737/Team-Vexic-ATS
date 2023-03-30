package Administrator;

import javax.swing.*;

public class AdministratorManageDatabase extends JFrame {


    private JPanel admanagedatabasePanel;
    private JButton backupButton;
    private JButton restoreButton;
    private JButton fixDatabaseButton;
    private JButton backButton;
    private JButton saveButton;
    private JButton logoutButton;

    public AdministratorManageDatabase() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("Manage Database");
        this.setContentPane(admanagedatabasePanel);
        this.setLocationRelativeTo(null);

    }
}
