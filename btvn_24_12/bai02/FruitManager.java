package btvn_24_12.bai02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FruitManager {
    private ArrayList<Fruit> fruits = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Fruit creatFruit() {
        System.out.println(" input type");
        String type = scanner.next();
        System.out.println(" input weight: ");
        double weight = scanner.nextDouble();
        System.out.println(" input taste");
        String taste = scanner.next();
        System.out.println("input color");
        String color = scanner.next();
        System.out.println("input price");
        double price = scanner.nextDouble();
        scanner.nextLine();
        return new Fruit(type, weight, taste, color, price);
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void displayAll() {
        for (Fruit f : fruits) {
            System.out.println(f);
        }
    }

    public ArrayList<Fruit> searchByType(String type) {
        ArrayList<Fruit> fruit = new ArrayList<>();
        for (Fruit f : fruits) {
            if (f.getType().equals(type)) {
                fruit.add(f);
            }
        }
        return fruit;
    }

    public ArrayList<Fruit> findMaxBill() {
        ArrayList<Fruit> fruit = new ArrayList<>();
        double max = fruits.get(0).getPrice() * fruits.get(0).getWeight();
        for (Fruit f : fruits) {
            if (f.getPrice() * f.getWeight() > max) {
                max = f.getPrice() * f.getWeight();
            }
        }
        for (Fruit f0 : fruits) {
            if (f0.getWeight() * f0.getPrice() == max) {
                fruit.add(f0);
            }
        }
        return fruit;

    }

    public ArrayList<Fruit> oneMillionCanBuyWhichFruitMax() {
        ArrayList<Fruit> fruit = new ArrayList<>();
        double max = fruits.get(0).getPrice();
        for (Fruit f : fruits) {
            if (f.getPrice() > max) {
                max =  f.getPrice();
            }
        }
        for (Fruit f1 : fruits) {
            if (f1.getPrice() == max) {
                fruit.add(f1);
            }
        }
        return fruit;
    }

    public ArrayList<Fruit> deleteFruitByType(String type) {
        ArrayList<Fruit> fruit = new ArrayList<>();
        for (Fruit f : fruits) {
            if (f.getType().equals(type)) {
               fruit.add(f);
            }
        }
        fruits.removeAll(fruit);
        return fruit;
    }


}





