import javax.swing.*;
import java.awt.*;

public class LoginWindow {
    public static void main(String[] args) {
        //We have created an JFrame object
        JFrame frame = new JFrame("Login Window");

        //We have adjusted the FlowLayout
        frame.setLayout(new FlowLayout());

        //We have created the JLabel object
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        //We have created the JTextField objects
        JTextField userField = new JTextField(20);
        JTextField passField = new JTextField(20);

        //This is the ok button
        JButton okButton = new JButton("OK");

        //We have created the JPanel object
        JPanel panel = new JPanel();

        //Assembled all the components into the panel
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(okButton);

        //serLabel.setLocation(5, 5);
        //.setLocation(250,250);
        //okButton.setLocation(100,100);
        //insert the panel in our frame
        frame.add(panel);

        //frame size
        frame.setSize(1000, 800);

        //frame close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //make frame visible
        frame.setVisible(true);
    }
}