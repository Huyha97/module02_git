package btvn_24_12.bai01;

import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManager {
    private ArrayList<Laptop> laptops = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public Laptop creatLaptop() {
        System.out.println("input brand: ");
        String brand = scanner.next();
        System.out.println("input color: ");
        String color = scanner.next();
        System.out.println("input price: ");
        double price = scanner.nextDouble();
        System.out.println("input quanity: ");
        int quanity = scanner.nextInt();
        scanner.nextLine();
        return new Laptop(brand, color, price, quanity);
    }

    public boolean addLaptop(Laptop laptop) {
        return laptops.add(laptop);
    }

    public Laptop editLaptop(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                laptop = l;
            }

        }

        if (laptop != null) {
            int index = laptops.indexOf(laptop);
            System.out.println("input new brand: ");
            String brand = scanner.next();
            laptop.setBrand(brand);
            System.out.println("input new color: ");
            String color = scanner.next();
            laptop.setColor(color);
            System.out.println("input new price: ");
            double price = scanner.nextDouble();
            laptop.setPrice(price);
            System.out.println("input new quanity: ");
            int quanity = scanner.nextInt();
            laptop.setQuanity(quanity);
            laptops.set(index, laptop);
        }
        return laptop;
    }

    public Laptop Deletelaptop(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                laptop = l;
            }

        }
        if (laptop != null) {
            laptops.remove(laptop);
        }
        return laptop;
    }

    public void displayAll() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public ArrayList<Laptop> displayByBrand(String brand) {
        ArrayList<Laptop> laptop = new ArrayList<>();
        for (Laptop lap : laptops) {
            if (lap.getBrand().equals(brand)) {
                laptop.add(lap);
            }
        }
        return laptop;
    }

    public ArrayList<Laptop> SearchLaptopByPriceRange(double priceDown, double priceUp) {
        ArrayList<Laptop> laptopList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            boolean checkPrice = laptop.getPrice() < priceUp && laptop.getPrice() > priceDown;
            if (checkPrice) {
                laptopList.add(laptop);
            }
        }
        return laptopList;
    }

    public void SearchbyColor(String color) {
        for (Laptop laptop : laptops) {
            if (laptop != null && laptop.getColor().equals(color)) {
                System.out.println(laptop);
            }
        }
    }


}
