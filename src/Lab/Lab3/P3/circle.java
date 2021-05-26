package Lab.Lab3.P3;
import Lab.Lab3.P1.*;

import java.util.Scanner;

public class circle extends shape {

    private double radius;

    public circle(){
        Scanner scn=new Scanner(System.in);

        System.out.println("Please enter the radius of circle: ");
        this.radius=scn.nextFloat();
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
