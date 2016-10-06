package Listing22;

import java.util.Scanner;

/**
 * Created by andrei on 10/6/16.
 */

public class Main{

    public static void main(String[]args){

/*      double dub1;
        double dub2;
        double dub3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a double.");
        dub1 = scan.nextDouble();

        System.out.println("Please enter another double.");
        dub2 = scan.nextDouble();

        System.out.println("Please enter one last double.");
        dub3 = scan.nextDouble();

        double total1 = (dub1 + dub2 + dub3) / 3;
        int total2 = (int) total1;

        System.out.print("Your total is: " + total2);

*/

        int int1;
        int int2;
        int int3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer.");
        int1 = scan.nextInt();

        System.out.println("Please enter another integer");
        int2 = scan.nextInt();

        System.out.println("Please enter one last integer");
        int3 = scan.nextInt();

        double total = (int1 + int2 + int3) / 3.0;

        System.out.print("Your total is: " + total);

    }
}
