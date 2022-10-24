/*
 *
 * The program calculates the amount of logs
 *
 * @author:  Ethan Prieur1
 * @version: 1.0
 * @since:   2022-10-24
*/

import java.util.Scanner;

/**
* This is the starting of main program.
*/
public abstract class Main {
    /**
     * Constant Variable Weight.
     */
    static final int LOGWEIGHT = 20;
    /**
     * Constant Variable Weight Limit.
     */
    static final int MAXTRUCKAMOUNT = 1100;

    /**
    * The starting main() function.
    *
    * @param args No args will be used.
    */
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log length (0.25, 0.5 or 1.0): ");
        float lengthNumber = sc.nextFloat();
        float weight = MAXTRUCKAMOUNT / (lengthNumber * LOGWEIGHT);

        System.out.println(+weight);
        System.out.println("logs can fit in the truck");
        System.out.println("\nDone.");
    }
}
