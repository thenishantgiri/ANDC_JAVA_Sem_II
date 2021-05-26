package HomeAssignment03;

import java.util.Scanner;

public class sum_avg_array {

    public static void main(String[] args) {
        System.out.println("Please enter the number of elements to be inserted : ");
        Scanner scn = new Scanner(System.in);

        int numOfElements = scn.nextInt();
        float[] arr = new float[numOfElements];


        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Please input the " + i + "th element of the array : ");
            arr[i] = scn.nextFloat();
        }

        float sum = 0;

        for (int i = 0; i < numOfElements; i++) {
            sum = sum + arr[i];
        }

        float avg = sum / numOfElements;

        System.out.println("Sum of Array : " + sum);
        System.out.println("Average of Array : " + avg);
    }
}
