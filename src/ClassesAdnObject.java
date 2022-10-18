public class ClassesAdnObject {

    public static void main(String[] args) {
        System.out.println("Hello Java!\n");

        Person person1 = new Person();
        person1.name = "Gintaras";
        person1.age = 47;
        System.out.println("Mano vardas " + person1.name + "," + " man " + person1.age + " metu");
        Person person2 = new Person();
        person2.name = "Tomas";
        person2.age = 25;
        System.out.println("Mano vardas " + person2.name + "," + " man " + person2.age + "  metu");
    }
}

class Person {
    String name;
    int age;
}
