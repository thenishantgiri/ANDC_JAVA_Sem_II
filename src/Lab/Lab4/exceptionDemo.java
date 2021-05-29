package Lab.Lab4;

import java.util.Scanner;

public class exceptionDemo {

    static void test(int age) throws UnderAge {
        if (age < 18) {
            throw new UnderAge(age);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your Age: ");

        int age = scn.nextInt();

        try {
            test(age);
            System.out.println("You're an Adult.");
        } catch (UnderAge error) {
            System.err.println(error.getMessage());
        } finally {
            scn.close();
        }
    }
}
