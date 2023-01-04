package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // java pati parenka kokia naudojam systema
        // String path = separator + "C:" + separator + "Users" + separator + "ginta" + separator + "CA" + separator + "ReadingFromFIle.txt"; // path C:\Users\ginta\CA iki file ReadingFromFile.txt
        String path = separator + "Users" + separator + "ginta" + separator + "CA" + separator + "ReadingFromFIle.txt"; // path /c/Users/ginta/CA iki file ReadingFromFile.txt

        File file = new File(path);

        Scanner scanner = new Scanner(file); // nuskaito is file
        //while (scanner.hasNextLine()) { //ciklas vyks kol yra Line from file, hasNextLine metodas grazina true, jeigu dar yra Line
            //System.out.println(scanner.nextLine()); // metodas nextLine isveda line i console

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[5];
            int counter = 0;

            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }
            // String[] words = line.split(" 0 ");
            System.out.println(Arrays.toString(numbers));
        // System.out.println(numbers);
            // System.out.println(Arrays.toString(words));

        //}

        scanner.close();

        // Scanner scanner = new Scanner(System.in); // skaito is konsoles
        // String input = scanner.nextLine();
    }
}
