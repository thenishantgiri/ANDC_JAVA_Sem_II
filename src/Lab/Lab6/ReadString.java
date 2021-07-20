package Lab.Lab6;

import java.io.*;

public class ReadString {

    public static void main(String[] args) throws IOException {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the string : ");
        String str = obj.readLine();

        System.out.println(str);

    }
}

