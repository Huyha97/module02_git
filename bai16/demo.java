package bai16;

import java.io.*;

public class demo {
    public static void main(String[] args) throws FileNotFoundException {
        String[] names = {"Huy","trung"," tuyen"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            writer.write("writing to a file");
            writer.write("\nHere is another line");

            for (String name: names) {
                writer.write("\n" + name);
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\This MC\\Desktop\\gitmodule02\\bai16\\thuchanh01\\huy.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
