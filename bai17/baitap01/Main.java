package bai17.baitap01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm sp");
            System.out.println("2. Hiển thị sp theo id");
            System.out.println("3. Xóa sp");
            System.out.println("4. Đọc file");
            System.out.println("5. Hiển thị tất cả");
            System.out.println("0.Exit ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productManager.creatProduct();
                    break;
                case 2:
                    System.out.println(" input id muon hien thi");
                    int idDisplay = scanner.nextInt();
                    scanner.nextLine();
                    productManager.displayProduct(idDisplay);
                    break;
                case 3:
                    System.out.println(" input id muon xoa");
                    int idDelete = scanner.nextInt();
                    ArrayList<Product> arrayList3 = productManager.deleteProductById(idDelete);
                    System.out.println(arrayList3);
                    break;
                case 4:
                    productManager.readFromFile("bai17/baitap01/saveFile.txt");
                    break;
                case 5:
                    productManager.displayAll();
                    break;
            }
        }
        while (choice != 0);
    }
}
