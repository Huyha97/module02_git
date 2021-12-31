package bai20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("vidu.text");

        if (file.exists()) {
            System.out.println(" file exist!");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File not found");
        }



        ///2: gh idu lieu vao file
        FileOutputStream fos = null;
        Scanner scanner = new Scanner(System.in);

        try{
            fos = new FileOutputStream("test.txt");
            for(;;) {
                System.out.println("insert line into file:");
                String line = scanner.nextLine() + "\n";
                byte[] b = line.getBytes();

                fos.write(b);

                System.out.println("Continue y/n");
                String choose = scanner.nextLine();

                if (choose.equalsIgnoreCase("N"))
                    break;
            }

//            String line = " HA DANG HUY";
//            String line2 = "18 tuoi";
//            byte[] b = line.getBytes();
//            byte[] c = line2.getBytes();
//            fos.write(b);
//            fos.write(c);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


