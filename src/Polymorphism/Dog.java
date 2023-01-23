package Polymorphism;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Abstract.Dog is eating...");
    }

    public void bark() {
        System.out.println("Abstract.Dog is barking...");
    }
}
