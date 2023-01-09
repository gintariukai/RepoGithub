package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        System.out.println("\nHello Exception!\n-------------------");

        File file = new File("asdf");

        // Visas išimtis reikia apdoruoti individualia, kad vartotojui nebutu baisu ir viskas aiskuu

        try {
            Scanner scanner = new Scanner(file); // yra du budai: vienas metodas - add throws FileNttFoundException arba kitas metodas - try/catch
        } catch (FileNotFoundException e) {
            // Intelij pasiula metoda - throw new RuntimeException(e);
            // bet mes galim isvesti savo Ispejima!
            System.out.println("Failas nerastas, ieskok klaidos!");
        }

        // po klaidos, išimti kuria mes pasirinkome, galima testi koda

        System.out.println("po bloko ' - try / catch ' galima testi");

        // readFIle(); // taip pat turime pasirinkti metoda kuris apdoruotu musu išimti-klaida
        try {
            readFIle();
        } catch (FileNotFoundException e) {
            System.out.println("Apdoruojimas išimčiu metode Main");
        }
    }

    public static void readFIle() throws FileNotFoundException { // ši metoda išimti mes apdorojome, nemeta klaidos, bet tai turime padaryti visur
        File file = new File("README");
        Scanner scanner = new Scanner(file);

    }
}
