package bai21.thuchanh01;

public class FactoryAnimal {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
