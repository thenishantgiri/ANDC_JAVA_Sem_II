package HomeAssignment03;

import java.util.Scanner;

public class sort {

    public static void main(String[] args) {
        System.out.println("Please enter the number of elements to be inserted : ");
        Scanner scn = new Scanner(System.in);

        int numOfElements = scn.nextInt();
        int[] arr = new int[numOfElements];


        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Please input the " + i + "th element of the array : ");
            arr[i] = scn.nextInt();
        }

        bubbleSort(arr);

        for (int elements : arr) {
            System.out.println(elements);
        }
    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
