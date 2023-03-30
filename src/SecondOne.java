import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SecondOne extends JFrame {
    private JPanel secondPanel;
    private JLabel Image1;

    SecondOne() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,800);
        this.setTitle("V");
        this.setContentPane(secondPanel);
        this.setLocationRelativeTo(null);

        ImageIcon originalIcon = new ImageIcon("Images/TeamLogo.png");
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, -1, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        Image1.setIcon(scaledIcon);
        Image1.setSize(100, 100);
        Image1.setBorder(new EmptyBorder(40, 40, 40, 80));
    }


}
