package Lab.Lab1;

import java.util.Scanner;

class complex {

    //datatype declaration
    int real;
    int img;

    void input() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the Real Part : ");
        real = scn.nextInt();

        System.out.println("Please enter the Imaginary Part : ");
        img = scn.nextInt();
    }

    //addition
    void add(complex c2) {
        real = real + c2.real;
        img = img + c2.img;
    }

    //multiply
    void multiply(complex c2) {
        real = (real * c2.real) - (img * c2.img);
        img = (real * c2.img) + (img * c2.real);
    }

    //overloading toString
    public String toString() {
        return real + " + " + img + "i";
    }
}

class lab1 {

    public static void main(String args[]) {

        complex c1 = new complex();
        complex c2 = new complex();

        c1.input();
        System.out.println("Entered Value : " + c1);
        c2.input();
        System.out.println("Entered Value : " + c2);
        System.out.println("Complex Number after Addition :");

        c1.add(c2);
        System.out.println(c1);

        System.out.println("Complex Number after Multiplication : ");

        c1.multiply(c2);
        System.out.println(c1);
    }
}