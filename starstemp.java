/**
 * Created by ANDREI on 11/18/16.
 */

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {

        // part 1
        final int MAX_ROWS = 10;
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 1; star <= row; star++)
                System.out.print(BLUE + "*");
                System.out.println();

        } System.out.println();

        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 10; star >= row; star--)
                System.out.print("*");
                System.out.println();

        } System.out.println();

        // part 2
        for (int row = 0; row < 10; row++) {
            for (int star = 0; star <= 10 - row; star++)
                System.out.print(" ");
            for (int star = 0; star <= row; star++)
                System.out.print(RED + "*");
            System.out.print("\n");

        } System.out.println();

        for (int row = 0; row < 10; row++) {
            for (int star = 0; star < row; star++)
                System.out.print(" ");
            for (int star = row; star < 10; star++)
                System.out.print("*");
            System.out.println();

        } System.out.println();

        // part 3
        for (int row = 1; row < 10; row += 2) {
            for (int star = 0; star < 9 - row / 2; star++)
                System.out.print(" ");

            for (int star = 0; star < row; star++)
                System.out.print(GREEN + "*");
                System.out.print("\n");
        }

        for (int row = 7; row > 0; row -= 2) {
            for (int star = 0; star < 9 - row / 2; star++)
                System.out.print(" ");

            for (int star = 0; star < row; star++)
                System.out.print("*");
                System.out.print("\n");
        }
    }
}

