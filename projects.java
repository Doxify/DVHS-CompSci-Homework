package com.hydrapvp.project;

import java.util.Scanner;

/**
 * Created by andrei on 10/21/16.
 */
public class Main {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int project;

        System.out.print("Please select which project you'd like to do. \nYou can either choose project 1 or 2. ");
        project = scan.nextInt();

        // this makes sure you select 1 or 2, makes you select again if you select anything other than 1 or 2
        if (project != 1 && (project != 2 )){

            System.out.print("Please select either 1 or 2! ");
            project = scan.nextInt();

        // this is the first project
        } if (project == 1){

            double x1, x2, y1, y2;

            // this is how you get the user to input numbers
            System.out.print("\nProject 1 Selected! \n \nPlease enter your first point in the following format (X Y): ");
            x1 = scan.nextDouble();
            y1 = scan.nextDouble();

            System.out.print("Please enter your second point in the following format (X Y): ");
            x2 = scan.nextDouble();
            y2 = scan.nextDouble();

            //formula
            /*
            d=((x2-x1)2+(y2-y1)2)½
            Write your code and test with
            x1=0
            x2=3
            y1=0
            y2=4
            your result should be 5.0
             */
            double formula1 = (x2 - x1) * (x2 - x1);
            double formula2 = (y2 - y1) * (y2 - y1);
            double formula3 = formula1 + formula2;
            double total = formula3 / 5;


            System.out.print("\nThe distance is: " + total);


        // this is the second project
        } if (project == 2){


            int hours, minutes, seconds;

            // this is where the user inputs the hours, minutes and seconds
            System.out.print("\nProject 2 Selected! \n \nPlease enter a number for the hours variable: ");
            hours = scan.nextInt();

            System.out.print("Please select a number for the minutes variable: ");
            minutes = scan.nextInt();

            System.out.print("Please select a number for the seconds variable: ");
            seconds = scan.nextInt();

            // formula
            int hoursfinal = 3600 * hours;
            int minutesfinal = 60 * seconds;
            int secondsfinal = seconds;
            int total = hoursfinal + minutesfinal + secondsfinal;

            System.out.print("\n" + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s) is " + total + " seconds!");


        }

    }
}
