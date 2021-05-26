package Lab.Lab2.P1;

import java.util.Scanner;

public class TwoDim {
    private int x;
    private int y;

    public TwoDim() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the x Co-ordinate : ");
        this.x = scn.nextInt();

        System.out.println("Please enter the y Co-ordinate : ");
        this.y = scn.nextInt();
    }

    public TwoDim(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Co-ordinates : x = " + x + "; y = " + y;
    }
}
