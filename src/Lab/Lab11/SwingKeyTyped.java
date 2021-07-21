package Lab.Lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingKeyTyped extends JFrame {

    JFrame jFrame;
    JLabel jLabel;

    SwingKeyTyped() {

        jFrame = new JFrame("Swing Key Event Listener");
        jLabel = new JLabel("Please provide keyboard input");

        jLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabel.setBounds(70, 50, 250, 30);

        jFrame.add(jLabel);

        jFrame.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent event) {
                jLabel.setText("Typed character is: " + event.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent event) {
                jLabel.setText("Pressed character is: " + event.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent event) {
                jLabel.setText("Released character is: " + event.getKeyChar());
            }
        });

        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(400, 200);
        jFrame.setLocation(500, 250);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingKeyTyped();
    }

}