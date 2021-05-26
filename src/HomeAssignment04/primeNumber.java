package HomeAssignment04;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the Left Bound : ");
        int leftBound = scn.nextInt();

        System.out.println("Please enter the Right Bound : ");
        int rightBound = scn.nextInt();

        for (int i = leftBound; i <= rightBound; i++) {

            if (i != 1 && checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
//                System.out.println("Not Prime");
                return false;
            }
        }
//        System.out.println("Prime");
        return true;
    }
}
