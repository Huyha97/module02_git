package bai16.baitap02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Main02 {
    public static void main(String[] args) {
        String file = "C:\\Users\\This MC\\Desktop\\gitmodule02\\bai16\\baitap02\\thuchanh.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);

                }
                System.out.println();
            }


        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
