public class ClassesAndObject3 {

    public static void main(String[] args) {
        System.out.println("\nHello repo-github!\n-------------------");

        Persons1 persons1 = new Persons1();
        persons1.setName("");
        persons1.setAge( -1 );
        System.out.println("Isvedam varda Main metode: " + persons1.getName());
        System.out.println("Isvedam metus Main metode: " + persons1.getAge() + "\n");

        System.out.println();

        persons1.speak();
    }
}

class Persons1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Laukas yra tuscias ");
        } else {
            this.name = userName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Laukas turi buti teigiamas \n");
        } else {
            this.age = userAge;
        }
    }

    void speak() {
        System.out.println("Mano vardas " + name + ", man " + age);
    }
}

