package Lab.Lab2.P;

import Lab.Lab2.P1.TwoDim;
import Lab.Lab2.P2.ThreeDim;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        TwoDim d1 = new TwoDim(3, 4);
        System.out.println(d1);

        ThreeDim d3 = new ThreeDim(5, 6, 7);
        System.out.println(d3);
    }
}
