public class This {

    public static void main(String[] args) {
        System.out.println("\nHello This!\n-------------------");

        Human human = new Human();
        human.setName("Tom");
        human.setAge(18);
        human.getInfo();
    }
}

class Human {
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

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
