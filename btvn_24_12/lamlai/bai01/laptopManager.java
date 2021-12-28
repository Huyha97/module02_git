package btvn_24_12.lamlai.bai01;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class laptopManager {
    private final ArrayList<Laptop> laptops = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public laptopManager() {
    }

    public Laptop creatLaptop() {
        System.out.println("input brand");
        String brand = scanner.next();
        System.out.println("input color");
        String color = scanner.next();
        System.out.println(" input price: ");
        double price = scanner.nextDouble();
        System.out.println(" input quanity: ");
        int quanity = scanner.nextInt();
        return new Laptop(brand, color, price, quanity);
    }

    //1
    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    //2:
    public Laptop editLaptop(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                laptop = l;
            }
        }
        if (laptop != null) {
            int index = laptops.indexOf(laptop);
            System.out.println("input new brand");
            String brand = scanner.next();
            laptop.setBrand(brand);
            System.out.println("input new color");
            String color = scanner.next();
            laptop.setColor(color);
            System.out.println(" input new price: ");
            double price = scanner.nextDouble();
            laptop.setPrice(price);
            System.out.println(" input new quanity: ");
            int quanity = scanner.nextInt();
            laptop.setQuantity(quanity);
            scanner.nextLine();
            laptops.set(index, laptop);
        }
        return laptop;
    }
//3//

    public Laptop deleteLaptop(int id) {
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
//4//

    public void displayALl() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
//    5//

    public ArrayList<Laptop> searchByBrand(String brand) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equals(brand)) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
    }
//7:
    public ArrayList<Laptop> searchByColor(String color) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop: laptops) {
            if (laptop.getColor().equals(color)) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
    }
    //6:
    public ArrayList<Laptop> searchByPriceRang(double priceD, double priceU) {
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        for (Laptop laptop: laptops) {
            if (laptop.getPrice() < priceU && laptop.getPrice() > priceD) {
                laptopArrayList.add(laptop);
            }
        }
        return laptopArrayList;
    }

    public ArrayList<String> listBrand(){
        ArrayList<String> strings = new ArrayList<>();
        for (Laptop laptop: laptops) {
            String lapatop;
            strings.add(laptop.getBrand());
        }
        return strings;
    }

    public void writeBrand(ArrayList<String> brandlist,String pathName) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
        for (String string : brandlist) {
            bufferedWriter.write(string + " \n");
        }
        bufferedWriter.close();
    }

    public void readBrand(String pathName) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
