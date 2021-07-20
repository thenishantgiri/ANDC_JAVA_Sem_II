package Lab.Lab10;

import java.awt.*;
import java.awt.event.*;

class PinkBackground extends Frame {

    Label label;

    PinkBackground() {

        super("a string with pink colour as background");
        label = new Label("Some Random Text");

        label.setBounds(40, 200, 300, 30);
        label.setAlignment(Label.CENTER);

        add(label);

        setBackground(Color.PINK);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        new PinkBackground();
    }
}