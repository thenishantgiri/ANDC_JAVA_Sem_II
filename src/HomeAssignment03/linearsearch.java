package HomeAssignment03;

import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {

        System.out.println("Please enter the number of elements to be inserted : ");
        Scanner scn = new Scanner(System.in);

        int numOfElements = scn.nextInt();
        int[] arr = new int[numOfElements];


        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Please input the " + i + "th element of the array : ");
            arr[i] = scn.nextInt();
        }

        System.out.println("Please enter the element to be searched : ");
        int element = scn.nextInt();

        int index = linearSearch(arr, element);

        if (index < 0) {
            System.out.println("The element you searched for is NOT PRESENT!");
        } else {
            System.out.println("Your element is PRESENT at " + index + "th Index!");
        }
    }

    public static int linearSearch(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
