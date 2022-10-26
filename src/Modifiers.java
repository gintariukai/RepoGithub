import PackageModifiers.Person;

public class Modifiers { // class gali buti tik public arba default, bet tik public class

    public int id; // pasiekiamas visam project repo=github
    private int id1; // pasiekiamas tik sitoj class Modifiers
    int id2; // default, kai nerasom nei private, nei public, t.y (package level)
    protected int id3; // pasiekiama package

    public static void main(String[] args) {
        System.out.println("\nHello repo-github!\n-------------------");
        // public, private, default(viskas kas default, pasiekiama tik sitam package),
        // protected(pasiekiamas tik viename package, o taip pat visiems subclass kurie randasi uz ribu package)

        Person person = new Person();
        person.name = "Bob";
    }

    // taip pat galim nauduoti metodus
    private void technicalMetyhod() { // pasiekiamas irgi tik Class Modofiers
    }
}

class Modifiers1{ // default class

}
