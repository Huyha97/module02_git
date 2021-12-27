package bai17.vd;

import java.io.IOException;
import java.io.InputStream;
// doc ky tu tu ban phim va hien ket qua len man hinh//
public class ReeadByConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true) {
            System.out.println(" input a chactacter: ");
            int ch = is.read();
            if (ch == 'q') {
                System.out.println(" Finished!");
                break;
            }
            is.skip(2);
            System.out.println("ky tu nhan duoc: " + (char) ch);
        }
    }
}
