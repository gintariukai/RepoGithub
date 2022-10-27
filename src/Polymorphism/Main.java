package Polymorphism;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello Polymorphism!\n-------------------");

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        dog.eat();

        System.out.println("----------------");

        Animal animal1 = new Dog();
        animal1.eat();
        // animal1.bark(); // neturim priejimo prie sio metodo
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();

        System.out.println("----------------");

        Animal animal2 = new Animal();
        Dog dog2 = new Dog();
        Cat cat2 = new Cat();

        test(animal2);
        test(dog2);
        test(cat2);

    }

    public static void test(Animal animal2) {
        animal2.eat();
    }
}
