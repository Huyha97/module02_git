package btvn_24_12.bai01;

public class Laptop {
    private static int VALUE = 0;
    private int id;
    private String brand;
    private String color;
    private double price;
    private int quanity;


    public Laptop() {
    }


    public Laptop(String brand, String color, double price, int quanity) {
        this.id = ++VALUE;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.quanity = quanity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quanity=" + quanity +
                '}';
    }


}
