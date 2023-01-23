package Abstract;

public class Abstract {
    public static void main(String[] args) {
        System.out.println("\nHello Abstract class!\n-------------------");

        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
    }
}
