package com.hydrapvp.projects2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by andrei on 10/25/16.
 */
public class Main {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        // decimal format
        DecimalFormat df = new DecimalFormat("#.000");
        DecimalFormat df2 = new DecimalFormat("#.0");
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // this is part a

        double d, b, h, w;

        System.out.print("\nPlease enter the diameter of a circle: ");
        d = scan.nextDouble();

        System.out.print("\nPlease enter the base and height of a triangle: ");
        b = scan.nextDouble();
        h = scan.nextDouble();

        System.out.print("\nPlease enter the width of a square: ");
        w = scan.nextDouble();

        // perimeter of a circle
        double dformula = d * Math.PI;

        // perimeter of a triangle
        double bhformula1 = b * h;
        double bhformula2 = Math.sqrt((b * b) + (h * h));
        double bhfinal = bhformula1 + bhformula2;

        //perimeter of a square
        double wformula = 4 * w;

        // prints the perimeter of everything
        System.out.print("\nThe perimeter of a circle with a diameter of " + d + " is: " + df.format(dformula));
        System.out.print("\nThe perimeter of a triangle with a base of " + b + " and a height of " + h + " is: " + df.format(bhfinal));
        System.out.print("\nThe perimeter of a square with a width of " + w + " is: " + df.format(wformula));

        // this is part b
        /*
        Trial 2
        Calculate the cost of the circle, triangle, and rectangle.

        prompt the user for a cost per square unit.
        Calculate the areas of each object and print to 3 decimal places.
        Calculate the cost of each object and print using NumberFormat.
        Sum the costs and print the total cost using NumberFormat.
         */
        double cost;

        System.out.print("\n \nPlease enter the cost per square foot: ");
        cost = scan.nextDouble();

        // areas of a circle, triangle, and square

        double darea1 = (d / 2) * (d / 2);
        double darea2 = Math.PI * darea1;
        double total1 = cost * darea2;

        double bharea = .5 * (b * h);
        double total2 = cost * bharea;

        double warea = w * w;
        double total3 = cost * warea;

        System.out.print("\nThe cost of square with an area of " + df2.format(darea2) + " is: " + money.format(total1));
        System.out.print("\nThe cost of a triangle with an area of " + df2.format(bharea) + " is: " + money.format(total2));
        System.out.print("\nThe cost of a square with an area of " + df2.format(warea) + " is: " + money.format(total3));

        // get the sum of all costs
        double sum = total1 + total2 + total3;
        System.out.print("\nThe sum of all costs is: " + money.format(sum));


        }


}
