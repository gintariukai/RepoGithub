import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("\nHello DoWhile!\n-------------------");

        Scanner scanner = new Scanner(System.in);

// metodas WHILE
//        System.out.println("Ivesk skaiciu nuo 1 iki  5 ");
//        int value = scanner.nextInt();
//        while (value != 5) {
//            System.out.println("Ivesk skaiciu 5 ");
//            value = scanner.nextInt();
//        }

// metodas DO WHILE
         int valueKitas;
         do {
             System.out.println("Ivesk skaiciu nuo 1 iki  5 ");
             valueKitas = scanner.nextInt();
         } while (valueKitas != 5);
        System.out.println("Jus ivedete skaiciu 5 ");
    }
}
