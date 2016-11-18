package com.hydrapvp.projects;


/**
 * Created by ANDREI 3000 on 11/18/16.
 */
public class Main {

    public static void main(String[] args) {

        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {

            for (int star = 1; star <= row; star++)
                System.out.print("*");
            System.out.println();

        }

        System.out.println(" \n");

        for (int row = 1; row <= MAX_ROWS; row++) {

            for (int star = 10; star >= row; star--)
                System.out.print("*");
            System.out.println();
        }

        System.out.println(" \n");

        final int LEAST_ROWS = 0;

        for (int row = 10; row <= LEAST_ROWS; row++) {

            for (int star = 1; star >= row; star--)
                System.out.print("*");
            System.out.println();

        }
    }

}


