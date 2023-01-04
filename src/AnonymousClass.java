interface AbleToEat {
    public void eating();
}

//class Animals implements AbleToEat { // anonymus class
//
//    @Override
//    public void eating() {
//        System.out.println("eating Able to Eat...");
//    }
//}

class Animal {
    public void eat() {
        System.out.println("Animal is eating...\n");
    }
}

//class OtherAnimal extends Animal {
//    public void eat() {
//        System.out.println("Other animal is eating...");
//    }
//}

public class AnonymousClass {

    public static void main(String[] args) {
        System.out.println("\nHello Ananimus!\n-------------------");

        Animal animal = new Animal();
        animal.eat();

//        OtherAnimal otherAnimal = new OtherAnimal();
//        otherAnimal.eat();

//        AbleToEat ableToEat = new Animals();
//        ableToEat.eating();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eating() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eating();

        System.out.println("=========");

        Animal animal1 = new Animal() {
            public void eat() { // anonymus metodas
                System.out.println("Other anonymus animal is eating...");
            }
        };
        animal1.eat();
    }
}
