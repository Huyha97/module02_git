package btvn_24_12.bai01;

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
                        int id2 = scanner.nextInt();
                        Laptop laptopEdit = laptopManager.editLaptop(id2);

                    } catch (Exception e) {
                        System.out.println("Failed!!! Please try again!");
                    }
                    break;
                case 3:
                    System.out.println(" input id laptop which you want delete");
                    int id3 = scanner.nextInt();
                    Laptop laptopDelete = laptopManager.Deletelaptop(id3);
                    break;
                case 4:
                    laptopManager.displayAll();
                    break;
                case 5:
                    System.out.println(" input the brand of laptop you want display");
                    String brand = scanner.next();
                    ArrayList<Laptop> arr5 = laptopManager.displayByBrand(brand);
                    System.out.println(arr5);
                    break;
                case 6:
                    System.out.println("Input Down price: : ");
                    int priceDown = scanner.nextInt();
                    System.out.println("Input Up price: ");
                    int priceUp = scanner.nextInt();
                    ArrayList<Laptop> laptops = laptopManager.SearchLaptopByPriceRange(priceDown, priceUp);
                    System.out.println("Display all laptops by price range:  ");
                    System.out.println();
                    for (Laptop lap : laptops) {
                        System.out.println(lap);
                    }
                    break;
                case 7:
                    System.out.println("input the color want to file: ");
                    scanner.nextLine();
                    String color = scanner.nextLine();
                    laptopManager.SearchbyColor(color);
                    break;


            }

        } while (choice != 0);
    }
}
