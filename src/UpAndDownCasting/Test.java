package UpAndDownCasting;

public class Test {

    public static void main(String[] args) {
        System.out.println("\nHello UpAandDownCasting!\n-------------------");

        Dog dog = new Dog();  // vaikine clase pereme tevine klase
        // Upcasting , Java padaro pati, nieko is musu nepraso
        Animal animal = dog;
        dog.eat();

        // Downcasting
        //Abstract.Dog dog1 = animal; // meta klaida, todel turim ivesti patys metoda
        Dog dog2 = (Dog) animal;
        dog2.bark();

        // Su DownCasting reikia elgtis atsargiau
//        Abstract.Animal a = new Abstract.Animal();
//        Abstract.Dog dog3 = (Abstract.Dog) a; // Downcasting g.b nesaugus meta perspejima (klaida)
//        dog3.bark();

    }
}
