package HomeAssignment05;

import java.util.Scanner;

public class student {

    Scanner scn = new Scanner(System.in);
    private int rollNo;
    private String name;
    private String course;
    private String[] subjects;

    student() {
        rollNo = 1254;
        name = "Nishant Kumar Giri";
        course = "B.Sc. (Hons) Computer Science";
        subjects = new String[]{"Java", "Discrete Structure", "Environmental Science", "Economics - (Macro)"};
/*
        subjects[0] = "Java";
        subjects[1] = "Discrete Structure";
        subjects[2] = "Environmental Science";
        subjects[3] = "Economics - (Macro)";
 */
    }

    student(int rollNo, String name, String course, String[] subjects) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.subjects = subjects;
    }

    void input() {
        System.out.println("Please input Roll No.: ");
        rollNo = scn.nextInt();

        System.out.println("Please enter the Name: ");
        name = scn.next();

        System.out.println("Please enter the Course: ");
        course = scn.next();

        System.out.println("Please enter the Subjects: ");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print((i + 1) + " subject: ");
            subjects[i] = scn.next();
        }
    }

    void display() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.print("Subjects: ");
        for (String sub : subjects) {
            System.out.print("'" + sub + "' ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        student stu1 = new student();

        student stu2 = new student(1271, "Asadullah Muradi", "B.Sc. (Hons) Computer Science"
                , new String[]{"Java", "Discrete Structure", "Environmental Science", "Economics - (Macro)"});

        student stu3 = new student();

        student stu4 = stu2;

        stu3.input();

        stu1.display();
        stu2.display();
        stu3.display();
        stu4.display();
    }
}
