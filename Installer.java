import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Installer {

    public static void main(String[] args) {
        new Installer();
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("My First Installer");
        JButton button = new JButton("Install");

panel.setBorder(BorderFactory.createEmptyBorder(150, 150, 100, 150));



frame.add(panel, BorderLayout.CENTER);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setTitle("My First Installer");
frame.pack();
frame.setVisible(true);
panel.add(button);
panel.add(label);
    }
}