public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("\nHello BreakContinue!\n-------------------");
// pavyzdys su breik
//        int i = 0;
//        while (true) {
//            if (i == 9) {
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Jus isejote is ciklo");

// pavyzdys su continue
        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(" sis skaicius nelyginis " + i);
        }
    }
}
