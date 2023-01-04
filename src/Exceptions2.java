import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        System.out.println("\nHello Exception!\n-------------------");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println(" Ivedei kita skaiciu nei 0 ");
                }
            }
        }
    }
}
