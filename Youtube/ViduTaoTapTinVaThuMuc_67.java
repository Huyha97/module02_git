package Youtube;

import java.io.File;
import java.io.IOException;

public class ViduTaoTapTinVaThuMuc_67 {
    public static void main(String[] args) {
        File folder1 = new File("buoi25");
        File folder2 = new File("buoi01");

        System.out.println(" check if folder1 exits or not: " + folder1.exists());
        System.out.println(" check if folder2 exits or not: " + folder2.exists());

        File d1 = new File("Youtube/directory1");
        d1.mkdir();
        File d2 = new File("Youtube/directory1/directory2/directory3/directory4");
        d2.mkdir();
        d2.mkdirs();



        //tao tap tin :
        File file1 = new File("Youtube/directory1/vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("Youtube/directory1/vidu2.txt");
        try{
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file3 = new File("Youtube/directory1/vidu3.doc");
        try{
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file4 = new File("Youtube/directory1/vidu4.exe");
        try{
            file4.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}

