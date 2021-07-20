import java.io.*;

class Copyfile {

    public static void main(String [] args) throws Exception {

		FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1]);
		
        int c;

        while ((c = fin.read()) != -1) {
            fout.write(c);
        }

        System.out.println("Data Copied!");
    }
}  