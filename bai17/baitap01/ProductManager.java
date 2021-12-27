package bai17.baitap01;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
   private ArrayList<Product> products = new ArrayList<>();
   private Scanner scanner = new Scanner(System.in);

   public void creatProduct() {
       System.out.println(" input id: ");
       int id = scanner.nextInt();
       System.out.println("input name: ");
       String name = scanner.next();
       System.out.println(" input Brand");
       String brand = scanner.next();
       System.out.println("input price");
       double price = scanner.nextDouble();
       Product product = new Product(id,name,brand,price);
       products.add(product);
       writeToFile(products);
   }

   public void displayAll() {
       for (Product p: products) {
           System.out.println(p);
       }
   }

   public void displayProduct( int id) {
       Product product = null;
       for (Product p: products) {
           if (p.getId()==id) {
               product = p;
           }
       }
   }

   public ArrayList<Product> deleteProductById(int id) {
       ArrayList<Product> product = new ArrayList<>();
       for (Product p: products) {
           if (p.getId() == id) {
               product.add(p);
           }
       }
       products.removeAll(product);
       return product;
   }

    public void writeToFile(ArrayList<bai17.baitap01.Product> products) {

        try{
            FileOutputStream fos = new FileOutputStream("bai17/baitap01/saveFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readFromFile(String path) {
//       List<Product> products = new ArrayList<>();
       try {
           FileInputStream fis = new FileInputStream(path);
           ObjectInputStream ois = new ObjectInputStream(fis);
           products = (ArrayList<Product>) ois.readObject();
           fis.close();
           ois.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return products;
    }




}
