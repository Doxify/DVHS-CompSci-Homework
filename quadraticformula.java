package co.doxify.random;

import java.util.Scanner;

/**
 * Created by andrei on 10/18/16.
 */
public class Main {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        Double a, b, c;

        System.out.print("Please define A: ");
        a = scan.nextDouble();

        System.out.print("Please define B: ");
        b = scan.nextDouble();

        System.out.print("Please define C: ");
        c = scan.nextDouble();

        // this is the formula doing work
        double part1 = (b * b) - (4 * a * c);
        double part2 = - b + Math.sqrt(part1);
        double part3 = 2 * a;
        double total1 = part2 / part3;


        // this is the formula doing work
        double part4 = (b * b) - (4 * a * c);
        double part5 = - b - Math.sqrt(part4);
        double part6 = 2 * a;
        double total2 = part5 / part6;

        System.out.print("X = " + total1 + "\nX = " + total2);


    }

}
