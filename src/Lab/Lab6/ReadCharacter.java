package Lab.Lab6;

import java.io.*;

public class ReadCharacter {

    public static void main(String[] args) throws IOException {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the character : ");
        char data = (char) obj.read();

        System.out.println(data);

    }
}
