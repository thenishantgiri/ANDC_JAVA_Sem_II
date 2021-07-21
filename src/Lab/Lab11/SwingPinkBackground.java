package Lab.Lab11;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class SwingPinkBackground extends JFrame {

    JLabel jLabel;

    SwingPinkBackground() {

        super("Swing Pink Background");

        jLabel = new JLabel("Some Random Text");

        jLabel.setBounds(50, 110, 200, 30);
        jLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
        jLabel.setForeground(Color.WHITE);

        this.add(jLabel);

        this.setSize(300, 300);
        this.setLocation(500, 250);
        this.setLayout(null);
        this.setVisible(true);

        this.getContentPane().setBackground(Color.pink);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingPinkBackground();
    }
}
