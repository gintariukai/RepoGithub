public class PrimitiveDataTypesCasting {

    public static void main(String[] args) {
        System.out.println("\nHello Primitive Data Types!\n-------------------");

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        /*
        * byte	  1 byte	Stores whole numbers from -128 to 127
        * short	  2 bytes	Stores whole numbers from -32,768 to 32,767
        * int	  4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        * long	  8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        * float	  4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        * double  8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        * boolean 1 bit	Stores true or false values
        * char	  2 bytes	Stores a single character/letter or ASCII values
         */

        float myNumf = 5.75f;
        System.out.println(myNumf);
        float f1 = 35e3f;
        System.out.println(f1);

        long myNuml = 15000000000L;
        System.out.println(myNuml);

        double myNumd = 19.99d;
        System.out.println(myNumd);
        double d1 = 12E4d;
        System.out.println(d1);

        /*
        * Widening Casting (automatically) - converting a smaller type to a larger type size
        * byte -> short -> char -> int -> long -> float -> double
        *
        * Narrowing Casting (manually) - converting a larger type to a smaller size type
        * double -> float -> long -> int -> char -> short -> byte
         */

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        float f = 123.2f;
        int a = 123;

        long l = a;
        int x = (int)l; // Manual casting: long to int
        System.out.println(x); // Outputs 123

        double myDoubl = 9.78d;
        int myIntd = (int) myDoubl; // Manual casting: double to int

        System.out.println(myDoubl);   // Outputs 9.78
        System.out.println(myIntd);      // Outputs 9

        // The following examples demonstrate valid and invalid underscore placements (which are highlighted) in numeric literals:

    // Invalid: cannot put underscores
    // adjacent to a decimal point
        // float pi1 = 3_.1415F;
    // Invalid: cannot put underscores
    // adjacent to a decimal point
        // float pi2 = 3._1415F;
    // Invalid: cannot put underscores
    // prior to an L suffix
        // long socialSecurityNumber1 = 999_99_9999_L;

    // OK (decimal literal)
        int x1 = 5_2;
    // Invalid: cannot put underscores
    // At the end of a literal
        //int x2 = 52_;
    // OK (decimal literal)
        int x3 = 5_______2;

    // Invalid: cannot put underscores
    // in the 0x radix prefix
       //int x4 = 0_x52;
    // Invalid: cannot put underscores
    // at the beginning of a number
        //int x5 = 0x_52;
    // OK (hexadecimal literal)
        int x6 = 0x5_2;
    // Invalid: cannot put underscores
    // at the end of a number
        //int x7 = 0x52_;

    /*
    *The following example shows other ways you can use the underscore in numeric literals:
    *
    *long creditCardNumber = 1234_5678_9012_3456L;
    *long socialSecurityNumber = 999_99_9999L;
    *float pi =  3.14_15F;
    *long hexBytes = 0xFF_EC_DE_5E;
    *long hexWords = 0xCAFE_BABE;
    *long maxLong = 0x7fff_ffff_ffff_ffffL;
    *byte nybbles = 0b0010_0101;
    *long bytes = 0b11010010_01101001_10010100_10010010;
    *You can place underscores only between digits; you cannot place underscores in the following places:
    *
    *At the beginning or end of a number
    *Adjacent to a decimal point in a floating point literal
    *Prior to an F or L suffix
    *In positions where a string of digits is expected
     */
    }
}
