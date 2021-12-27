package bai17.vd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputSTreamExample {
    public static void main(String[] args) throws IOException {
        File file;
        OutputStream os= new FileOutputStream("output.txt");
        byte[] bytes = new byte[] { 'c','o','d','e','g','y','m'};

        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            os.write(b);
            os.close();

        }
    }
}
