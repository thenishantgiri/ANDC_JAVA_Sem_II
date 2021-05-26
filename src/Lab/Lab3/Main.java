package Lab.Lab3;

import Lab.Lab3.P1.*;
import Lab.Lab3.P2.*;
import Lab.Lab3.P3.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean flag = false;

        while(!flag){
            switch (shape()) {
                case 1 -> {
                    flag = true;
                    shape rec = new rectangle();
                    System.out.println("Area of Rectangle: " + rec.area());
                }
                case 2 -> {
                    flag = true;
                    shape cir = new circle();
                    System.out.println("Area of Circle: " + cir.area());
                }
                default -> System.out.println("Error: Please input a valid choice ");
            }
        }
    }

    private static int shape() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Here are your choices:\n 1. Rectangle\n 2. Circle");
        System.out.println("Please enter your choice: ");
        return scn.nextInt();
    }
}
