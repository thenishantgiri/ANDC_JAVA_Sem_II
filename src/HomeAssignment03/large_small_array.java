package HomeAssignment03;

import java.util.Scanner;

public class large_small_array {
    public static void main(String[] args) {

        System.out.println("Please enter the number of elements to be inserted : ");
        Scanner scn = new Scanner(System.in);

        int numOfElements = scn.nextInt();
        float[] arr = new float[numOfElements];

        float large = Integer.MIN_VALUE;
        float small = Integer.MAX_VALUE;

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Please input the " + i + "th element of the array : ");
            arr[i] = scn.nextFloat();

            if (arr[i] > large) {
                large = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }

        System.out.println("Smallest Number : " + small + "\n" + "Largest Number : " + large);
    }
}
