package PackageModifiers;

public class Test {

    public static void main(String[] args) {
        System.out.println("\nHello repo-github!\n-------------------");

        Person person = new Person();
        person.name = "String is Public"; // pasiekiamas String name, nes public
        System.out.println(person.name);

        Person person1 = new Person();
        //person1.name1 = "String is Private"; // nepasiekiamas String name1, nes private
        System.out.println("Negalim isvesti String name1, nes is Private name1");

        Person person2 = new Person();
        person2.name2 = "String is Default"; // nepasiekiamas String name1, nes private
        System.out.println(person2.name2);

        Person person3 = new Person();
        person3.name3 = "String is Default"; // nepasiekiamas String name1, nes private
        System.out.println(person3.name3);
    }
}
