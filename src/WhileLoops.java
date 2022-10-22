public class WhileLoops {
    public static void main(String[] args) {
        System.out.println("\nHello WhileLoops!\n-------------------");

        boolean t = true;
        boolean f = false;

        System.out.println("tiesa - " + t);
        System.out.println("melas -  " + f);

        System.out.println("======================");

        int value = 0;
        while (value < 5) {
            System.out.println("Tiesa 0<5 " + value);
            value = value+1;
        }
        System.out.println("======================");

        boolean a = 5 > 2;
        boolean b = 5 > 7;
        boolean c = 5 > 5;
        boolean d = 5 >= 5;
        boolean e = 5 ==5;

        System.out.println("5>2 daugiau: " + a);
        System.out.println("5>7 daugiau: " + b);
        System.out.println("5>5 daugiau: " + c);
        System.out.println("5>=5 daugiau arba lygu: " + d);
        System.out.println("5==5 ar lygu: " + e);
    }
}
