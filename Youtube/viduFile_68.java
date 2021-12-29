package Youtube;

import java.io.File;
import java.util.Scanner;

public class viduFile_68 {
    File file;

    public viduFile_68(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi() {
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
        return this.file.canRead();
    }

    public boolean kiemTraGhi() {
        return this.file.canWrite();
    }

    public void inDuongDan() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTen() {
        System.out.println(this.file.getName());
    }

    public void kiemTraLaThuMucHoacTapTin() {
        if (this.file.isDirectory()) {
            System.out.println("Day la thu muc");
        } else if (this.file.isFile()) {
            System.out.println(" day la tap tin");
        }
    }

    public void inCayThuMuc() {
        this.inChiTietCayThuMuc(this.file, 1);
    }

    public void inChiTietCayThuMuc(File f, int bac) {
        for (int i = 0; i < bac; i++) {
            System.out.println("\t");
        }
        System.out.println("|__");
            System.out.println(f.getName());
            if (f.canRead() && f.isDirectory()) {
                File[] mangCon = f.listFiles();
                for (File fx : mangCon) {
                    inChiTietCayThuMuc(fx, bac + 1);
                }
            }
        }


    public void inDanhSachCacFileCon() {
        if (this.file.isDirectory()) {
            System.out.println(" cac tap tin con/ thuc muc con la:");
            File[] mangCon = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println(" nhap ten file: ");
        String tenFile = scanner.nextLine();
        viduFile_68 vdf = new viduFile_68(tenFile);
        do {
            System.out.println("-------MENU---------");
            System.out.println("1. kiểm tra file có thể thực thi ");
            System.out.println("2. kiểm tra file có thể đọc ");
            System.out.println("3. kiểm tra file có thể ghi ");
            System.out.println("4. In đường dẫn ");
            System.out.println("5. In tên dẫn: ");
            System.out.println("6. kiểm tra file là thư mục hoặc tập tin ");
            System.out.println("7. in ra danh sách các file con:  ");
            System.out.println("8. in ra cây thư mục ");
            System.out.println("0. thoát ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(vdf.kiemTraDoc());
                    break;
                case 3:
                    System.out.println(vdf.kiemTraGhi());
                    break;
                case 4:
                    vdf.inDuongDan();
                    break;
                case 5:
                    vdf.inTen();
                    break;
                case 6:
                    vdf.kiemTraLaThuMucHoacTapTin();
                    break;
                case 7:
                    vdf.inDanhSachCacFileCon();
                    break;
                case 8:
                    vdf.inCayThuMuc();
                default:
                    break;
            }
        } while (choice != 0);
    }

}
