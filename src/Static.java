public class Static {

    public static void main(String[] args) {
        System.out.println("\nHello repo-github!\n-------------------");

        Human2 h1 = new Human2("Bob", 18);
        Human2 h2 = new Human2("Tadas", 34);
        Human2.descreption = "Nice";
        h1.getAllFields();
        h2.getAllFields();

        Human2.descreption = "BAD";
        h1.getAllFields();
        h2.getAllFields();

        System.out.println(Math.pow(2, 4)); // Klase Math neturi kintamosius
        System.out.println(Math.PI); // Klaseje Math nereikia kurti objektus, ji turi statinius

        h1.printNumberOfPeople();
        h2.printNumberOfPeople();

        System.out.println("---------------------");

        Human2 h3 = new Human2("Red", 7);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();




    }
}


class Human2 {

    private String name;
    private int age;

    public static String descreption;

    public static int countPeople;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++; // inklementuosim
    }

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

    public void getAllFields() {
        System.out.println(name + "-" + age + ", " + descreption);
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }

//    public static void printAllFields() {
//        System.out.println(descreption); // name negali buti
//    }
}

