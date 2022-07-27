package Day_8_Scanners;

import java.util.Scanner;

public class Topic2_next_nextLine {

    public static void main(String[] args) {

        /**
         *         Strings have 2 ways to be scanned
         *         1) next()
         *         2) nextLine()
         *
         *         next is for singular word/number/or characters string (it stops reading when it sees a space " ")
         *         nextLine is word sentence and phrase strings
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Put something on the console");
        String hi = input.next();
        System.out.println("The thing you put is " +hi);

















    }
}
