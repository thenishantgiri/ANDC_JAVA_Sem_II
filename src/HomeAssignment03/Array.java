package HomeAssignment03;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Please enter the number of elements to be inserted : ");
        Scanner scn = new Scanner(System.in);

        int numOfElements = scn.nextInt();
        int[] arr = new int[numOfElements];


        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Please input the " + i + "th element of the array : ");
            arr[i] = scn.nextInt();
        }

        System.out.println("Elements of Array : ");

        for (int i = 0; i < numOfElements; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
