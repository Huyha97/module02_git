package Youtube;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile_69 {
    public static void xoaFile(File fx) {
        if (fx.isFile()){
            System.out.println("Da xoa" + fx.getAbsolutePath());
            fx.delete();
        } else if (fx.isDirectory()){
            File[] mangCon = fx.listFiles();
            for (File f: mangCon) {
                xoaFile(f);
            }
            System.out.println("da xoa: "+ fx.getAbsolutePath());
            fx.delete();
        }
    }
    public static void xoaFile2(File fx){

    }

    public static void main(String[] args) {
        File f0 = new File("C:\\Users\\This MC\\Desktop\\gitmodule02\\Output.txt");
        File f0_1 = new File("C:\\Users\\This MC\\Desktop\\gitmodule02\\person.txt");
        File f_vidu = new File("C:\\Users\\This MC\\Desktop\\gitmodule02\\result.txt");


        Path p0 = f0.toPath();
        Path p0_1 = f0_1.toPath();
        Path p_vidu = f_vidu.toPath();

        try{
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p_vidu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
