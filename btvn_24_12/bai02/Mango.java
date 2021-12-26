package btvn_24_12.bai02;

public class Mango  extends Fruit{

    public Mango() {
    }


    public Mango(String type, double weight, String taste, String color, double price) {
        super(type, weight, taste, color, price);
    }

    public Mango(double weight, String taste, String color, double price) {
        super( weight, taste, color, price);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public String getTaste() {
        return super.getTaste();
    }

    @Override
    public void setTaste(String taste) {
        super.setTaste(taste);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
