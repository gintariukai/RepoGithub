public class ClassObjectAndToString {

    public static void main(String[] args) {
        System.out.println("\nHello ClassObjectAndToString!\n-------------------");

        Humann h1 = new Humann("Bob", 40);
        System.out.println(h1);

        Humans h2 = new Humans("Ted", 34);
        System.out.println(h2);
    }
}

class Humann {

    private String name;
    private int age;

    public Humann(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Humans {

    private String name;
    private int age;

    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }
}