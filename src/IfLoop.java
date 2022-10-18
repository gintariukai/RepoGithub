import java.util.Optional;

public class IfLoop {
    public static void main(String[] args) {

        System.out.println("======================");

        if (5 > 1) {
            System.out.println("Taip, tiesa, kad 5>1 ");
        }

        System.out.println("======================");

        if (5 > 7) {
            System.out.println("Taip, tiesa "); // Nieko nespausdins
            System.out.println("Nespausdina nieko");
        } else {
            System.out.println("\n Ne, netiesa, kad 5>7");
        }

        System.out.println("======================\n");

        int myInt = 15;
        if (myInt < 10) {
            System.out.println("Taip, tiesa ");
        } else if (myInt > 20){
            System.out.println("Ne, netiesa");
        } else {
            System.out.println("\n Nei vienas ne tinka  ...");
        }

        /*
        * Object object1 = Optional.ofNullable(0)
        *         .orElseGet(() -> new ForLoop());
         */

    }
}