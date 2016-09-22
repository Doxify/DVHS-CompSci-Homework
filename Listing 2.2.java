package Main;

/**
 * Created by andrei on 9/22/16.
 */
    public class Listing2_2{


    //-----------------------------------------------------------------
    //  Prints various facts.
    //-----------------------------------------------------------------
    public static void main(String[] args) {


        int year = 2016;
        int alphabet = 26;
        int areacode = 925;
        int topspeed = 408;

        // Strings can be concatenated into one long string
        System.out.println("These are some facts that "
                            + "I find interesting:");

        System.out.println();

        // A string can contain numeric digits
        System.out.println("Letters in the English alphabet: " + alphabet);

        // A numeric value can be concatenated to a string
        System.out.println("Antioch Area Code: " + areacode);
        System.out.println("Year in which the iPhone 7 was "
                            + "released: " + year);

        System.out.println("Top speed of a Bugatti Veyron: " + topspeed + " km/hour");

    }

}
