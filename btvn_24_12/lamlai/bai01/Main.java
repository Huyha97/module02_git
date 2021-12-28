package btvn_24_12.lamlai.bai01;

import btvn_24_12.bai01.Laptop;
import btvn_24_12.bai01.LaptopManager;

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
            System.out.println("5. Display all laptop by brand");
            System.out.println("6. Display all laptop in the price range");
            System.out.println("7. Search laptop by color");
            System.out.println("8. Write laptop to file");
            System.out.println("9. Read laptop to file");
            System.out.println("0. Exit");
            System.out.println("Input your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Laptop laptop = laptopManager.creatLaptop();
                    laptopManager.addLaptop(laptop);
                    break;
                case 2:
                    System.out.println(" input laptop edit: ");
                    int editId = scanner.nextInt();
                    Laptop laptopEdit = laptopManager.editLaptop(editId);
                    System.out.println(laptopEdit);
                    break;
                case 3:
                    System.out.println(" input laptop delete: ");
                    int deleteId = scanner.nextInt();
                    Laptop laptopDelete = laptopManager.Deletelaptop(deleteId);
                    System.out.println(deleteId);
                    break;
                case 4:
                    laptopManager.displayAll();
                    break;
                case 5:
                    System.out.println(" input brand want to display");
                    String brand= scanner.next();
                    ArrayList<Laptop> laptopBrand = laptopManager.displayByBrand(brand);
                    System.out.println("display all laptop by brand are: ");
                    for (Laptop p: laptopBrand) {
                        System.out.println(p);
                    }
                    break;
                case 6:
                    System.out.println("input downprice");
                    double priceD = scanner.nextDouble();
                    System.out.println("input upprice");
                    double priceU = scanner.nextDouble();
                    ArrayList<Laptop> laptops = laptopManager.SearchLaptopByPriceRange(priceD,priceU);
                    System.out.println(" display all laptop by price range : ");
                    for (Laptop l: laptops) {
                    System.out.println(l);
                    }
                    break;
                case 7:
                    System.out.println(" input color: ");
                    String color = scanner.next();
                    ArrayList<Laptop> laptopColor = laptopManager.searchbyColor(color);
                    for (Laptop laptop7 : laptopColor) {
                        System.out.println(laptop7);
                    }
                case 8:
                    try{
                        ArrayList<String> strings = laptopManager.listBrand();
                        laptopManager.writeBrand(strings,"btvn_24_12/bai01/brand.txt");
                        System.out.println("Write file sucucessfully!");
                    } catch(IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        System.out.println(" read file succesfully!");
                        laptopManager.readBrand("btvn_24_12/bai01/brand.txt");
                    } catch( IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
            }
        } while (choice !=0);
    }
}
