package co.doxify.leap;

import java.util.Scanner;

/**
 * Created by Andrei Georgescu on 11/17/2016.
 */
public class Main {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int year;

        System.out.print("Please select a year: ");
        year = scan.nextInt();

        //    formula
        // --------------
        // this says that it is true if the year has a remainder of 0 when divided
        // by four and doesn't have a remainder of 0 when divided by 100 OR
        // has a remainder of zero when divided by 400.
        // ---------------
        // basically it must satisfy the first and either second or third checks

        if ((year %4 == 0) && (year %100 != 0) || (year %400 == 0)){

            System.out.print(year + " is a leap year!");

        } else {

            System.out.print(year + " is not a leap year!");
        }


    }

}
