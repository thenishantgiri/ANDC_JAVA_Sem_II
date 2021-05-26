package Lab.Lab3.P2;

import java.util.Scanner;
import Lab.Lab3.P1.*;

public class rectangle extends shape {

    private float length, breadth;

    public rectangle(){
        Scanner scn=new Scanner(System.in);

        System.out.println("Please enter the length of rectangle: ");
        this.length=scn.nextFloat();

        System.out.println("Please enter the breadth of rectangle: ");
        this.breadth=scn.nextFloat();
    }

    public rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

