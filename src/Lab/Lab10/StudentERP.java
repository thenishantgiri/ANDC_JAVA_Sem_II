package Lab.Lab10;

import java.awt.*;
import java.awt.event.*;

public class StudentERP extends Frame implements ActionListener {

    Frame frame;
    Button btnA, btnB;
    TextArea textArea;

    StudentERP() {

        frame=new Frame("Student ERP");

        btnA = new Button("A");
        btnB = new Button("B");
        textArea = new TextArea();

        btnA.setBounds(100, 150, 100, 50);
        btnB.setBounds(200, 150, 100, 50);
        textArea.setBounds(100, 50, 100, 10);

        frame.add(btnA);
        frame.add(btnB);
        frame.add(textArea);

        btnA.addActionListener(this);
        btnB.addActionListener(this);

        frame.setBounds(500, 250,400,400);

        this.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == btnA) {
            textArea.setText("Name: Nishant Kumar Giri \nCourse: B.Sc.(Hons.) Computer Science \nRoll No: 1254 \nCollege: Acharya Narendra Dev College (University of Delhi)");
        } else textArea.setText("Previous Semester CGPA: 6.9");
    }

    public static void main(String[] args) {
        new StudentERP();
    }
}