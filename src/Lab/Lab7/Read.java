package Lab.Lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Read {

    public static void main(String[] args) {

        try {

            File source = new File("C:\\Users\\nisha\\IdeaProjects\\ANDC_JAVA_Sem_II\\src\\Lab\\Lab7\\source.txt");
            Scanner scannedSource = new Scanner(source);

            while (scannedSource.hasNextLine()) {

                String strData = scannedSource.nextLine();
                if (strData.charAt(0) == '/' && strData.charAt(1) == '/') {
                    System.out.println(strData);
                }
            }

            scannedSource.close();

        } catch (FileNotFoundException error) {
            System.out.println("Error: an unexpected error has occurred!");
            error.printStackTrace();
        }
    }
}
