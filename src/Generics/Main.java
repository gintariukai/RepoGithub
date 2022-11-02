package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello Generigs!\n-------------------");

        /////// iki Java 5 taip dare /////////////////
        List animals =  new ArrayList();
        animals.add("Cat");
        animals.add("Dog"); // 1
        animals.add("Frog");

        String animal = (String) animals.get(1); // Downcasting
        System.out.println(animal);
        //////////////////////////////////////////

        System.out.println("---");
        // ================Generic===========================

        List<String> animals2 = new ArrayList<>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog"); // 2

        String animal2 = animals2.get(2);
        System.out.println(animal2);

        ////////////////// Java 7 /////////////
        System.out.println("=======\n");

        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs); // wildcards / (List<?> list)

        /*
        *   Object       // (List<? super Animal> list) super tik Object
        *       Animal   // extends visus metodus Animal
        *           Dog  // extends visus metodus Dog ir Animal
         */
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat();
        }
    }

}
