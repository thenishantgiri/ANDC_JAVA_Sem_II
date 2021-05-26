package Lab.Lab2.P2;

import Lab.Lab2.P1.TwoDim;

import java.util.Scanner;

public class ThreeDim extends TwoDim {

    private int z;

    public ThreeDim() {
        super();
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the z Co-ordinate : ");
        this.z = scn.nextInt();
    }

    public ThreeDim(int x, int y, int z) {
        super(x, y);

        this.z = z;
    }

    public String toString() {
        return super.toString() + "; z = " + z;
    }
}
