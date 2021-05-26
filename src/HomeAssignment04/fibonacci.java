package HomeAssignment04;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the nth value: ");
        int num = scn.nextInt();

        fib(num);
    }

    public static void fib(int num) {

        int a, b = 1;

        int sum = 0;

        System.out.println("Fibonacci Series: ");
        while (sum <= num) {
            System.out.print(sum + " ");

            a = b;  // swap elements
            b = sum;
            sum = a + b;  // next term is the sum of the last two terms
        }
    }
}
