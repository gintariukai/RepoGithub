public class Arrays {
    public static void main(String[] args) {
        System.out.println("\nHello Arrays!\n-------------------");


        // int number = 10; // primitivus tipas // [10]

        System.out.println("=========================");
        // cia irasom i masiva duomenys
        int [] numbers = new int[5]; // numbers -> [masivas] tipas
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = i * 5;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("=========================");

        // jeigu zinom isanksto skaicius
        // cia perrasom masiva su duomenemis
        int[] numbers1 = {1, 2, 3, 4};
        for (int j : numbers1) {
            System.out.println(j);
        }
    }
}
