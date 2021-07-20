package Lab.Lab10;

import java.awt.*;
import java.awt.event.*;

class ButtonEvent implements ActionListener {

    Frame frame;
    Button btnRed, btnBlue;

    ButtonEvent() {

        frame = new Frame("Button Event Listener");

        btnRed = new Button("Red");
        btnRed.setBounds(120, 135, 50, 30);

        btnBlue = new Button("Blue");
        btnBlue.setBounds(220, 135, 50, 30);

        btnRed.addActionListener(this);
        btnBlue.addActionListener(this);

        frame.add(btnRed);
        frame.add(btnBlue);

        frame.setBounds(500, 250, 400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == btnRed) {
            frame.setBackground(Color.RED);
        } else {
            frame.setBackground(Color.BLUE);
        }

    }

    public static void main(String[] args) {
        new ButtonEvent();
    }
}

