package btvn_24_12.lamlaibai02;

public class Banana extends Fruit{


    public Banana(double weight, String taste, String color, double price) {
        super(weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Banana: " +super.toString();
    }
}
