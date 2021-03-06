package btvn_24_12.bai01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManager {
    private final ArrayList<Laptop> laptops = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public LaptopManager() {
    }

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
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equals(brand)) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
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

    public ArrayList<Laptop> searchbyColor(String color) {
        for (Laptop laptop : laptops) {
            if (laptop.getColor().equals(color)) {
                System.out.println(laptop);
            }
        }
        return null;
    }

    public ArrayList<String> listBrand() {
        ArrayList<String> strings = new ArrayList<>();
        for (Laptop laptop: laptops) {
            strings.add(laptop.getBrand());
        }
        return strings;
    }

    public void writeBrand(ArrayList<String> brandList, String pathName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathName));
        for (String string: brandList) {
            bw.write(string + "\n");
        }
        bw.close();
    }

    public void readBrand(String pathName) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(pathName));
        String line;
        while ((line = bf.readLine()) != null) {
            System.out.println(line);
        }
    }


}
