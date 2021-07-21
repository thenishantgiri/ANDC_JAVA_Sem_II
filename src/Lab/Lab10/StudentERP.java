package Lab.Lab10;

import java.awt.*;
import java.awt.event.*;

class AWTPersonalInfo extends Frame {

    Button btnClose;
    Panel panel;

    Label labelName, labelCourse, labelRollNo, labelCollege;
    TextField fieldName, fieldCourse, fieldRollNo, fieldCollege;

    AWTPersonalInfo(String name, String course, String rollNo, String college) {

        super("Personal Information");

        panel = new Panel();

        labelName = new Label("Name:");
        labelName.setBounds(20, 20, 80, 30);
        panel.add(labelName);

        labelCourse = new Label("Course:");
        labelCourse.setBounds(20, 50, 80, 30);
        panel.add(labelCourse);

        labelRollNo = new Label("Roll No:");
        labelRollNo.setBounds(20, 80, 80, 30);
        panel.add(labelRollNo);

        labelCollege = new Label("College:");
        labelCollege.setBounds(20, 110, 80, 30);
        panel.add(labelCollege);

        fieldName = new TextField(name);
        fieldName.setBounds(100, 22, 200, 24);
        fieldName.setEditable(false);
        panel.add(fieldName);

        fieldCourse = new TextField(course);
        fieldCourse.setBounds(100, 52, 200, 24);
        fieldCourse.setEditable(false);
        panel.add(fieldCourse);

        fieldRollNo = new TextField(rollNo);
        fieldRollNo.setBounds(100, 82, 200, 24);
        fieldRollNo.setEditable(false);
        panel.add(fieldRollNo);

        fieldCollege = new TextField(college);
        fieldCollege.setBounds(100, 112, 300, 24);
        fieldCollege.setEditable(false);
        panel.add(fieldCollege);

        btnClose = new Button("Close");
        btnClose.setBounds(150, 150, 75, 20);

        btnClose.addActionListener(e -> dispose());
        panel.add(btnClose);

        panel.setLayout(null);

        this.add(panel);
        this.setSize(425, 215);

        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                dispose();
            }
        });
    }
}

class AWTcgpa extends Frame {

    Label label;
    Button btnClose;

    public AWTcgpa(String cgpa) {

        super("CGPA");

        label = new Label("Previous Semester CGPA: " + cgpa);
        label.setBounds(70, 50, 280, 30);

        this.add(label);

        btnClose = new Button("Close");
        btnClose.setBounds(110, 100, 75, 20);

        this.add(btnClose);

        btnClose.addActionListener(event -> dispose());

        this.setSize(300, 150);

        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}

class StudentERP extends Frame implements ActionListener {

    Label labelA, labelB;
    Button btnA, btnB;

    StudentERP() {

        super("Student Information");

        labelA = new Label("Student Info");
        labelA.setBounds(40, 30, 100, 30);
        this.add(labelA);

        labelB = new Label("CGPA");
        labelB.setBounds(180, 30, 100, 30);
        this.add(labelB);

        btnA = new Button("A");
        btnA.setBounds(25, 65, 100, 30);
        btnA.addActionListener(this);
        this.add(btnA);

        btnB = new Button("B");
        btnB.setBounds(150, 65, 100, 30);
        btnB.addActionListener(this);
        this.add(btnB);

        this.setSize(280, 120);
        this.setLayout(null);
        this.setVisible(true);

        this.setLocationRelativeTo(null);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnA) {
            new AWTPersonalInfo("Nishant Kumar Giri", "B.Sc. (Hons.) Computer Science", "AC-1254", "Acharya Narendra Dev College (University of Delhi)");
        } else {
            new AWTcgpa("6.9");
        }
    }

    public static void main(String[] args) {
        new StudentERP();
    }

}
