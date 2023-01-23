package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class Exceptions4 {
    public static void main(String[] args) {
        System.out.println("\nHello Exception!\n-------------------");

        try {
            run();
        } catch (IOException | ParseException e) { // multi catch
            e.printStackTrace();
        }

        /*
        try {
            run();
        } catch (Exception e) {
            System.out.println("visos išimtis paveldi iš Exception");
        }
         */

    }

    public static void run() throws IOException, FileNotFoundException, ParseException, IllegalArgumentException {

    }
}
