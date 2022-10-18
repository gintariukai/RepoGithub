public class ForLoop {
    public static void main(String[] args) {

        System.out.println("======================");

        for (int i = 0; i <= 5; i++) {
            System.out.println("For ciklas spausdina tiesa, " + i); // i++ == i = i+1 (true)
        }

        System.out.println("======================");

        for (int r = 0; r <= 10; r = r+5) {
            System.out.println("For ciklas " + r); // i++ == i = i+1 (true)
        }

    }
}
