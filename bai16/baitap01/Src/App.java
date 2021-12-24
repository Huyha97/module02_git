package bai16.baitap01.Src;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        copyFile("C:\\Users\\This MC\\Desktop\\gitmodule02\\bai16\\baitap01\\File\\Source.txt","C:\\Users\\This MC\\Desktop\\gitmodule02\\bai16\\baitap01\\File\\DestFile.txt");
    }

    private static void copyFile(String sourcePath, String destPath) throws IOException
    {
        FileReader fr = new FileReader(sourcePath);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(destPath);
        BufferedWriter bw = new BufferedWriter(fw);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            bw.write(line);
            bw.write("\n");
        }
        bw.close();
        br.close();
    }
}

