package btvn_24_12.bai01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopManager laptopManager = new LaptopManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add laptop");
            System.out.println("2. Edit laptop");
            System.out.println("3. Delete laptop");
            System.out.println("4. Display all laptop");
            System.out.println("5. Display all laptop by Brand");
            System.out.println("6. Display all laptop in the price range ");
            System.out.println("7. Search laptop by color;");
            System.out.println("8. Write laptop to file");
            System.out.println("9. Read laptop to file");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        Laptop laptop = laptopManager.creatLaptop();
                        laptopManager.addLaptop(laptop);
                    } catch (Exception e) {
                        System.out.println("Failed!!! Please try again!");
                    }
                    break;
                case 2:
                    try {
                        System.out.println(" input id laptop which you want edit");
                        int editID = scanner.nextInt();
                        Laptop laptopEdit = laptopManager.editLaptop(editID);

                    } catch (Exception e) {
                        System.out.println("Failed!!! Please try again!");
                    }
                    break;
                case 3:
                    System.out.println(" input id laptop which you want delete");
                    int deleteID = scanner.nextInt();
                    Laptop laptopDelete = laptopManager.Deletelaptop(deleteID);
                    break;
                case 4:
                    laptopManager.displayAll();
                    break;
                case 5:
                    System.out.println(" input the brand of laptop you want display");
                    String brand = scanner.next();
                    ArrayList<Laptop> laptopBrand = laptopManager.displayByBrand(brand);
                    System.out.println(laptopBrand);
                    break;
                case 6:
                    System.out.println("Input Down price: : ");
                    int priceDown = scanner.nextInt();
                    System.out.println("Input Up price: ");
                    int priceUp = scanner.nextInt();
                    ArrayList<Laptop> laptops = laptopManager.SearchLaptopByPriceRange(priceDown, priceUp);
                    System.out.println("Display all laptops by price range:  ");
                    System.out.println();
                    for (Laptop laptop : laptops) {
                        System.out.println(laptop);
                    }
                    break;
                case 7:
                    System.out.println("input the color want to file: ");
                    scanner.nextLine();
                    String color = scanner.nextLine();
                    ArrayList<Laptop> laptopColor = laptopManager.searchbyColor(color);
                    System.out.println("Display all laptop by color: ");
                    for (Laptop laptop : laptopColor) {
                        System.out.println(laptop);
                    }
                    break;
                case 8:
                    try {
                        ArrayList<String> strings = laptopManager.listBrand();
                        laptopManager.writeBrand(strings, "btvn_24_12/bai01/brand.txt");
                        System.out.println("wrtite file scuccessfully!!!");
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        System.out.println("Read file successfully!!!");
                        laptopManager.readBrand("btvn_24_12/bai01/brand.txt");
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
            }
        } while (choice != 0) ;
    }
}
