package Lab.Lab11;

import java.awt.event.*;
import javax.swing.*;

class PersonalInfo extends JFrame {

    JButton btnClose;
    JPanel panel;

    JLabel labelName, labelCourse, labelRollNo, labelCollege;
    JTextField fieldName, fieldCourse, fieldRollNo, fieldCollege;

    PersonalInfo(String name, String course, String rollNo, String college) {

        super("Personal Information");

        panel = new JPanel();

        labelName = new JLabel("Name:");
        labelName.setBounds(20, 20, 80, 30);
        panel.add(labelName);

        labelCourse = new JLabel("Course:");
        labelCourse.setBounds(20, 50, 80, 30);
        panel.add(labelCourse);

        labelRollNo = new JLabel("Roll No:");
        labelRollNo.setBounds(20, 80, 80, 30);
        panel.add(labelRollNo);

        labelCollege = new JLabel("College:");
        labelCollege.setBounds(20, 110, 80, 30);
        panel.add(labelCollege);

        fieldName = new JTextField(name);
        fieldName.setBounds(70, 22, 200, 24);
        fieldName.setEditable(false);
        panel.add(fieldName);

        fieldCourse = new JTextField(course);
        fieldCourse.setBounds(70, 52, 200, 24);
        fieldCourse.setEditable(false);
        panel.add(fieldCourse);

        fieldRollNo = new JTextField(rollNo);
        fieldRollNo.setBounds(70, 82, 200, 24);
        fieldRollNo.setEditable(false);
        panel.add(fieldRollNo);

        fieldCollege = new JTextField(college);
        fieldCollege.setBounds(70, 112, 300, 24);
        fieldCollege.setEditable(false);
        panel.add(fieldCollege);

        btnClose = new JButton("Close");
        btnClose.setBounds(150, 150, 75, 20);

        btnClose.addActionListener(e -> dispose());
        panel.add(btnClose);

        panel.setLayout(null);

        this.add(panel);
        this.setSize(400, 215);

        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

class CGPA extends JFrame {

    JLabel jLabel;
    JButton btnClose;

    public CGPA(String cgpa) {

        super("CGPA");

        jLabel = new JLabel("Previous Semester CGPA: " + cgpa);
        jLabel.setBounds(10, 10, 280, 30);
        jLabel.setHorizontalAlignment(JLabel.CENTER);

        this.add(jLabel);

        btnClose = new JButton("Close");
        btnClose.setBounds(110, 50, 75, 20);

        this.add(btnClose);

        btnClose.addActionListener(event -> dispose());

        this.setSize(300, 120);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}

class SwingStudentERP extends JFrame implements ActionListener {

    JLabel jLabelA, jLabelB;
    JButton btnA, btnB;

    SwingStudentERP() {

        super("Student Information");

        jLabelA = new JLabel("Student Info");
        jLabelA.setBounds(40, 25, 300, 30);
        this.add(jLabelA);

        jLabelB = new JLabel("CGPA");
        jLabelB.setBounds(185, 25, 300, 30);
        this.add(jLabelB);

        btnA = new JButton("A");
        btnA.setBounds(25, 55, 100, 50);
        btnA.addActionListener(this);
        this.add(btnA);

        btnB = new JButton("B");
        btnB.setBounds(150, 55, 100, 50);
        btnB.addActionListener(this);
        this.add(btnB);

        this.setSize(300, 170);
        this.setLayout(null);
        this.setVisible(true);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnA) {
            new PersonalInfo("Nishant Kumar Giri", "B.Sc. (Hons.) Computer Science", "AC-1254", "Acharya Narendra Dev College (University of Delhi)");
        } else {
            new CGPA("6.9");
        }
    }

    public static void main(String[] args) {
        new SwingStudentERP();
    }
}

