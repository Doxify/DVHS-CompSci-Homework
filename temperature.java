package com.doxify.temperature;

/**
 * Created by andrei on 9/30/16.
 */
public class Main {

    // these are the colors for console
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[]args){

        // int celsius and fahrenheit is where you enter the starting temperature you want converted
        int celsius = 30;
        int fahrenheit = 0;

        // double fToC andr cToF are the formulas used for conversion
        double fToC = (fahrenheit - 32) * .5555;
        double cToF = (celsius * 1.8) + 32;

        if(celsius + cToF  > 80){

            // prints out conversion for celsius to fahrenheit
            System.out.print("Detected celsius temperature... \nUsing celsius to fahrenheit formula...\n");
            System.out.print(ANSI_RED+celsius + "° celsius is " + cToF + "° fahrenheit!");


        }

        else if(celsius + cToF  > 50){

            // prints out conversion for celsius to fahrenheit
            System.out.print("Detected celsius temperature... \nUsing celsius to fahrenheit formula...\n");
            System.out.print(ANSI_YELLOW+celsius + "° celsius is " + cToF + "° fahrenheit!");

        }

        else if(celsius + cToF  > 20){

            // prints out conversion for celsius to fahrenheit
            System.out.print("Detected celsius temperature... \nUsing celsius to fahrenheit formula...\n");
            System.out.print(ANSI_BLUE+celsius + "° celsius is " + cToF + "° fahrenheit!");

        }

        else if(celsius + cToF  > 0){

            // prints out conversion for celsius to fahrenheit
            System.out.print("Detected celsius temperature... \nUsing celsius to fahrenheit formula...\n");
            System.out.print(ANSI_WHITE+celsius + "° celsius is " + cToF + "° fahrenheit!");

        }


        // this detects if you are trying to convert both fahrenheit and celsius
        else if(celsius > 0 && fahrenheit > 0){

            System.out.print("Detected fahrenheit and celsius temperature... \nUsing both formulas...\n");
            System.out.print(fahrenheit + "° fahrenheit is " + fToC + "° celsius! \n");
            System.out.print(celsius + "° celsius is " + cToF + "° fahrenheit!");
        }

        // if statements detects if you want to convert either fahrenheit or celsius
        else if(celsius == 0){

            // prints out conversion for fahrenheit to celsius
            System.out.print("Detected fahrenheit temperature... \nUsing fahrenheit to celsius formula...\n");
            System.out.print(fahrenheit + "° fahrenheit is " + fToC + "° celsius!");

        } else {

            // prints out conversion for celsius to fahrenheit
            System.out.print("Detected celsius temperature... \nUsing celsius to fahrenheit formula...\n");
            System.out.print(celsius + "° celsius is " + cToF + "° fahrenheit!");

        }

    }


}
