package Extends;

public class TestExtends {

    public static void main(String[] args) {
        System.out.println("\nHello Extends!\n-------------------");

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.showName();
    }
}
