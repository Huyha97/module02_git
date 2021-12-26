package btvn_24_12.bai02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FruitManager fruitManager = new FruitManager();
        int choice;
        do {
            System.out.println("-----------MENU---------------");
            System.out.println("1.Nhập 1 loại quả");
            System.out.println("2.Hiển thị tất cả các loại quả theo loại ");
            System.out.println("3.Hiển thị quả có đơn giá cao nhất");
            System.out.println("4.Nếu có 1000000d có thể mua quả nào nhiều nhất. Hiển thị quả đó");
            System.out.println("5.Xóa 1 quả khỏi danh sách ");
            System.out.println("6.Hiển thị tất cả  ");
            System.out.println(" nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Fruit fruit = fruitManager.creatFruit();
                    fruitManager.addFruit(fruit);
                    break;
                case 2:
                    System.out.println(" Nhập loại quả muốn tìm: ");
                    String type = scanner.next();
                    ArrayList<Fruit> arrayList2 = fruitManager.searchByType(type);
                    System.out.println(arrayList2);
                    break;
                case 3:
                    ArrayList<Fruit> arrayList3 = fruitManager.findMaxBill();
                    System.out.println(arrayList3);
                    break;
                case 4:
                    ArrayList<Fruit> arrayList4 = fruitManager.oneMillionCanBuyWhichFruitMax();
                    System.out.println(arrayList4);
                    break;
                case 5:
                    System.out.println(" nhập quả muốn xóa: ");
                    String type5 = scanner.next();
                    ArrayList<Fruit> arrayList5 = fruitManager.deleteFruitByType(type5);
                    System.out.println(arrayList5);
                    break;
                case 6:
                    fruitManager.displayAll();
                    break;
            }

        } while (choice != 0);
    }
}




