public class ArraysOfStringsForEach {

    public static void main(String[] args) {
        System.out.println("=============================");

        int[] numbers = new int[3];
        numbers[0] = 5;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]); // masivo dezute tuscia, todel 0

        System.out.println("=============================");

        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "Java";
        // strings[3] = " Pasaulis ";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        // System.out.println(strings[3]); //masyvo dezute tuscia

        System.out.println("===========================");

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println("===========================");

        for (String eilute : strings) {
            System.out.println(eilute);
        }

        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }
        System.out.println("============================");
        System.out.println(sum);


    }
}
