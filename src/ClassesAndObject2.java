public class ClassesAndObject2 {

    public static void main(String[] args) {
        System.out.println("\nHello repo-github!\n-------------------");

        Persons person1 = new Persons();
        person1.name = "Gintaras";
        person1.age = 47;
        person1.speak();

        System.out.println();

        Persons person2 = new Persons();
        person2.name = "Tomas";
        person2.age = 25;
        person2.speak2();
    }
}

class Persons {
    String name;
    int age;

    void speak() {
        System.out.println("Mano vardas " + name + ", man " + age);
    }

    void speak2() {
        for (int i=0; i<3; i++) {
            System.out.println("Mano vardas " + name + ", man " + age);
        }
    }
}
