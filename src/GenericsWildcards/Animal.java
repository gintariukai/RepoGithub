package GenericsWildcards;

public class Animal {
    private int id;

    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Abstract.Animal is eating...");
    }

    public String toString() {
        return String.valueOf(id);
    }

}
