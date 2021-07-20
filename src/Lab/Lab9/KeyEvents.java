package Lab.Lab9;

import java.awt.*;
import java.awt.event.*;

public class KeyEvents extends Frame implements KeyListener {

    Label label;
    TextArea area;

    KeyEvents() {

        label = new Label();
        label.setBounds(125, 50, 100, 20);

        area = new TextArea();
        area.setBounds(30, 100, 300, 100);
        area.addKeyListener(this);

        add(label);
        add(area);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        label.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        label.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyEvents();
    }
}
