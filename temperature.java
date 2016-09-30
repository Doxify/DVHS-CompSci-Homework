package com.doxify.temperature;

/**
 * Created by andrei on 9/30/16.
 */
public class Main {

    public static void main(String[]args){

        // int celsius and fahrenheit is where you enter the starting temperature you want converted
        int celsius = 31;
        int fahrenheit = 80;

        // double fToC and cToF are the formulas used for conversion
        double fToC = (fahrenheit - 32) * .5555;
        double cToF = (celsius * 1.8) + 32;

        // this detects if you are trying to convert both fahrenheit and celsius
        if(celsius > 0 && fahrenheit > 0){

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
