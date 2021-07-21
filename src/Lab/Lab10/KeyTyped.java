package Lab.Lab10;

import java.awt.*;
import java.awt.event.*;

class KeyTyped extends Frame {

    Frame frame;
    Label label;

    KeyTyped() {

        frame = new Frame("Key Typed");

        label = new Label();
        label.setBounds(50, 65, 300, 20);
        label.setAlignment(Label.CENTER);

        frame.add(label);

        frame.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent event) {
                label.setText("Typed character is: " + event.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent event) {
                label.setText("Pressed character is: " + event.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent event) {
                label.setText("Released character is: " + event.getKeyChar());
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setBounds(500, 250, 400, 150);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new KeyTyped();
    }
}