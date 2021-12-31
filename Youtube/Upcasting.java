package Youtube;

public class Upcasting {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal1 = cat;
        Animal animal2 = (Animal) cat;

        cat.eat();
        cat.meow();
        animal1.eat();
        animal2.eat();
    }
}
