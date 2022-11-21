/*
* This program makes an hourglass.
*
* @author  Peter Gemmell
* @version 1.0
* @since 11/06/1982 
*/

import java.util.Scanner;

/**
* This program makes an hourglass.
*/
final class Hourglass {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Hourglass() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Creates the hourglass.
    *
    * @param sand the amount of sand in the hourglass
    * @param centre the amount of extra spaces to centre the sand
    */
    static void hourglass(final int integer, final int spacesNum) {
        String output = "";
        int counter1;
        int counter2;
        for (counter1 = 0; counter1 < spacesNum; counter1++) {
            output += " ";
        }

        for (counter2 = 0; counter2 < integer; counter2++) {
            output += "* ";
        }
        System.out.println(output);

        if (integer > 1) {
            hourglass(integer - 1, spacesNum + 1);
        }
        System.out.println(output);
    }

    /**
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {
        final String invalidInputStr = "\nInvalid Input";

        // input
        final Scanner userInput = new Scanner(System.in);
        System.out.print("Insert height of hourglass: ");

        try {
            final int inputNum = userInput.nextInt();
            System.out.println();
            if (inputNum > 1) {
                // process
                hourglass(inputNum, 0);
            } else {
                System.out.println(invalidInputStr);
            }
        } catch (java.util.InputMismatchException ex) {
            System.err.print(invalidInputStr);
        }
    }
}
