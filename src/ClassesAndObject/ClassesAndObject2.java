package ClassesAndObject;

public class ClassesAndObject2 {

    public static void main(String[] args) {
        System.out.println("\nHello ClassesAndObject!\n-------------------");

        Persons person1 = new Persons();
        person1.name = "Gintaras";
        person1.age = 47;
        person1.speak();
        int years1 = person1.calculateYearsToRetirement();
        System.out.println(person1.name + ", Jums iki pensijos liko " + years1 + " metu");

        System.out.println();

        Persons person2 = new Persons();
        person2.setName("Tomas");
        person2.age = 25;
        person2.speak();

        System.out.println();

        Persons person3 = new Persons();
        String str = "Dell";
        person3.setName(str);
        person3.speak2();

        System.out.println();

        Persons person4 = new Persons();
        person4.setNameAndAge(str, 12);
        person4.speak();

    }
}

class Persons {
    String name;
    int age;

    void setName(String username) {
        name = username;
    }

    void setNameAndAge(String user, int userage) {
        name =user;
        age = userage;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Mano vardas " + name + ", man " + age);
    }

    void speak2() {
        for (int i=0; i<3; i++) {
            System.out.println("Mano vardas " + name + ", man " + age + " :) ");
        }
    }
}
