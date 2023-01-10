package GenericsWildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello Generigs!\n-------------------");

        /////// iki Java 5 taip dare /////////////////
        List animals =  new ArrayList();
        animals.add("Abstract.Cat");
        animals.add("Abstract.Dog"); // 1
        animals.add("Frog");

        String animal = (String) animals.get(1); // Downcasting
        System.out.println(animals);// visa metodus
        System.out.println(animal); // tik viena 'get'(1)
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
        *   Object       // (List<? super Abstract.Animal> list) "super" tik Object, auksciau uz Abstract.Animal
        *       Abstract.Animal   // extends visus metodus Abstract.Animal ir Abstract.Dog
        *           Abstract.Dog  // extends visus metodus Abstract.Dog
         */
    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat();
            System.out.println(">>>>>><<<<<<<");
        }
    }

}
