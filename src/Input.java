import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("\nHello Input!\n-------------------");

        Scanner scaner = new Scanner(System.in);
        System.out.println("Ivesk ka nors, zodi arba skaiciu:");

        String string = scaner.nextLine();
        System.out.println("Jus ivedete zodi " + string);

        int skaicius = scaner.nextInt();
        System.out.println("Jus ivedete skaiciu " + skaicius);
    }
}
