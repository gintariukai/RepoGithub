public class MultidimensionalArrays {

    public static void main(String[] args) {
        System.out.println("\nHello MultidimensionalArrays!\n-------------------");

        int[] number = {1, 2, 4, 3}; // odnomernyi masiv

        int[] [] matric = {{1, 2, 3, 4, 5, 6},
                            {4, 5, 6},
                            {7, 8, 9}};

        for (int[] ints : matric) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println(number[1]);
        System.out.println(matric[2] [2]);
        System.out.println(matric[0] [4]);

        /**
         *  1, 2, 4, 3 / odnomernyi masiv
         * <p>
         *  156
         *  376 / vyzvatj [1] [1] / budet i stroka i stalbec (cislo "7")
         *  268 /dvuchmernyi masiv
         */

        String[] [] strings = new String[2][3];
        System.out.println(strings[0] [1]);

        strings[0] [1] = "Labas, kaip sekasi?";
        System.out.println(strings[0] [1]);


    }
}
