package StringBuilder;

public class StringBuilder2 {

    public static void main(String[] args) {
        System.out.println("\nHello stringBuilder!\n-------------------");

        System.out.println("Labas");
        System.out.print("Sveiki,");
        System.out.println(" Gera diena");

        System.out.printf("%f This is %s a string, %d\n", 9.2, "HiHi", 100);

        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 11532);
        System.out.printf("String %10d \n", 123456789);

        System.out.printf("---------------\nString %d \n", 532);
        System.out.printf("String %d \n", 5);
        System.out.printf("String %d \n", 11532);
        System.out.printf("String %d \n", 123456789);

        System.out.printf("----------\nString %.2f \n", 5.32234);
        System.out.printf("String %.2f \n", 5.32934);

    }
}