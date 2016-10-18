package co.doxify.listingtwoeight;

/**
 * Created by andrei on 10/10/16.
 */
public class Main {

//********************************************************************
//  StringMutation.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the String class and its methods.
//********************************************************************

    //-----------------------------------------------------------------
    //  Prints a string and various mutations of it.
    //-----------------------------------------------------------------
    public static void main(String[] args) {


        String phrase = new String("Change is inevitable");
        String mutation1, mutation2, mutation3, mutation4;


        System.out.println("Original string: \"" + phrase + "\"");
        System.out.println("Length of string: " + phrase.length());


        mutation1 = phrase.concat(", except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        mutation4 = mutation3.substring(3, 30);

        // Print each mutated string
        System.out.println("Mutation #1: " + mutation1);
        System.out.println("Mutation #2: " + mutation2);
        System.out.println("Mutation #3: " + mutation3);
        System.out.println("Mutation #4: " + mutation4);
        System.out.println("Mutated length: " + mutation4.length());

        // separates the original code from my version
        System.out.println("==================================================");

        // this string is the original sentence
        String sentence = new String("The quick brown fox jumps over the dog");

        // this prints out the original sentence and the length of it
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Letters in this sentence: " + sentence.length());

        // these are actual strings that change my original sentence
        String alt1 = sentence.concat(", unless the dog is larger than the brown fox");
        String alt2 = alt1.toUpperCase();
        String alt3 = alt2.replace('F', 'E');
        String alt4 = alt3.toLowerCase();

        // this prints out each modification
        System.out.println("Alternate #1: " + alt1);
        System.out.println("Alternate #2: " + alt2);
        System.out.println("Alternate #1: " + alt3);
        System.out.println("Alternate #2: " + alt4);

    }
}

