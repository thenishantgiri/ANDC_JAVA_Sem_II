package Lab.Lab11;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class SwingButtonEvent extends JFrame implements ActionListener {

    JButton btnRed;
    JButton btnBlue;

    SwingButtonEvent() {

        super("Button Event Listener");

        btnRed = new JButton("Red");
        btnRed.setBounds(100, 100, 80, 40);

        btnBlue = new JButton("Blue");
        btnBlue.setBounds(220, 100, 80, 40);

        btnRed.addActionListener(this);
        btnBlue.addActionListener(this);

        this.add(btnRed);
        this.add(btnBlue);

        this.setSize(400, 300);
        this.setLocation(500, 250);
        this.setLayout(null);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == btnRed) {
            this.getContentPane().setBackground(Color.RED);
        } else {
            this.getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new SwingButtonEvent();
    }
}