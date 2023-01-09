import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        System.out.println("\nHello Exception!\n-------------------");

        // Checked Exception (Compile time exception) = išimčiu klaidos programoje
        /*
        File file = new File("asdf");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas, ieskok klaidos!");
        }
        */

        // Unchecked (Runtime exception) = cia labiau klaida, nei isimtis programoje

        /*
        int a = 1 / 0; // išmeta klaida: Exception in thread "main" java.lang.ArithmeticException: / by zero
        // šios klaidos neturi buti, nes negalima dalynti iš nulio
         */

        /*
        String name = null; // null = niekas, tusčia
        name.length(); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null
         */

        int[] arr = new int[2];
        System.out.println(arr[2]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2


    }
}
