package Lab.Lab2.P;

import Lab.Lab2.P1.TwoDim;
import Lab.Lab2.P2.ThreeDim;

public class Main {
    public static void main(String[] args) {

        TwoDim d1 = new TwoDim(7, 21);
        System.out.println(d1);

        ThreeDim d3 = new ThreeDim(7, 8, 6);
        System.out.println(d3);
    }
}
