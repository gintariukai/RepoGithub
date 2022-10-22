public class Constructor {

    public static void main(String[] args) {
        System.out.println("\nHello Constructor!\n-------------------");

        Human1 human1 = new Human1("Bob", 2);
        Human1 human2 = new Human1("");
        Human1 human3 = new Human1();

    }
}

class Human1 {

    public Human1(String name) {
        System.out.println("\nSveiki is pirmo konstruktoriaus");
        this.name = name;
    }

    public Human1(String name, int age) {
        System.out.println("Sveiki is antro konstruktoriaus! ");
        this.name = name;
        this.age = age;
    }

    public Human1() {
        System.out.println("\nSveiki is trecio konstruktoriaus");
        this.name = " Vardas pagal reiksme.. ";
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
