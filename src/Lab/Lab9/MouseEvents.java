package Lab.Lab9;

import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame implements MouseListener {

    Label label;

    MouseEvents() {

        addMouseListener(this);

        label = new Label();
        label.setBounds(80, 100, 100, 40);
        add(label);        setSize(250, 250);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseEvents();
    }
}