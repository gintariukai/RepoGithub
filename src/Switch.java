import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("\nHello Switch!\n-------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ivesk kiek Tau metu ");
        int age = scanner.nextInt();

// nefunkcionalu, kai daug salygu
//        if (age == 7) {
//            System.out.println(" Tu dar mokaisi kokykloje ....");
//        } else if (age == 19) {
//            System.out.println(" Ooo, Tu jau baigiai mokykla");
//        } else {
//            System.out.println(" Sveikinam istojai i Univera");
//        }

        switch (age) {
            case 7 :
                System.out.println(" Tu dar mokaisi kokykloje ....");
                break;
            case 19 :
                System.out.println(" Ooo, Tu jau baigiai mokykla");
                break;
            default:
                System.out.println(" Nei viena salyga netitinka...");
        }
    }
}
