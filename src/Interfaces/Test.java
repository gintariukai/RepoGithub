package Interfaces;

public class Test {
    public static void main(String[] args) {
        System.out.println("====================");

        Info info1 = new Animal(2);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();

        System.out.println("======================");

        Animal animal2 = new Animal(3);
        Person person2 = new Person("Karl");
        outputInfo(animal2);
        outputInfo(person2);

/**
 * Galima ir taip
        *Animal animal1 = new Animal(1);
        *Person person1 = new Person("Jon");
        *animal1.showInfo();
        *person1.showInfo();
*/

    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
