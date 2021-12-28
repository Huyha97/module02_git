package btvn_24_12.lamlaibai02;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitManager {
    private ArrayList<Fruit> fruits = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public FruitManager() {
    }

    public void displayAll() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void displayApple() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                System.out.println(fruit);
            }
        }
    }

    public void displayBanana() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Banana) {
                System.out.println(fruit);
            }
        }
    }

    public void displayLemon() {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Lemon) {
                System.out.println(fruit);
            }
        }
    }

    public Fruit creatFruit(int choice) {
        System.out.println(" input kg: ");
        double weight = scanner.nextDouble();
        System.out.println(" input taste");
        String taste = scanner.next();
        System.out.println("input color");
        String color = scanner.next();
        System.out.println(" input price: ");
        double price = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            return new Apple(weight, taste, color, price);
        } else if (choice == 2) {
            return new Banana(weight, taste, color, price);
        } else if (choice == 3) {
            return new Lemon(weight, taste, color, price);
        }
        return null;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public ArrayList<Fruit> deleteByPrice(double price) {
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        for (Fruit fruit: fruits) {
            if (fruit.getPrice() == price) {
                fruitArrayList.add(fruit);
            }
        }
        fruits.removeAll(fruitArrayList);
        return fruitArrayList;
    }

    public void displayByMaxPrice(){
        double maxPrice = fruits.get(0).getPrice();
        for (Fruit fruit: fruits) {
            if (fruit.getPrice() > maxPrice) {
                maxPrice = fruit.getPrice();
            }
        }
        for (Fruit fruit: fruits) {
            if (fruit.getPrice() == maxPrice) {
                System.out.println(fruit);
            }
        }
    }

    public void displayByMinPrice(){
        double minPrice = fruits.get(0).getPrice();
        for (Fruit fruit: fruits) {
            if (fruit.getPrice() < minPrice) {
                minPrice = fruit.getPrice();
            }
        }
        for (Fruit fruit: fruits) {
            if (fruit.getPrice() == minPrice) {
                System.out.println(fruit);
            }
        }
    }











}





