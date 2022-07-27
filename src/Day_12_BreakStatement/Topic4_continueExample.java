package Day_12_BreakStatement;

import java.util.Scanner;

public class Topic4_continueExample {

    public static void main(String[] args) {


        /**
         *      Write a code where it checks every character in a string , and when it sees a "L" or "A", then pass
         *      Print the end result
         */

        Scanner scan = new Scanner(System.in);
        String ex = scan.next();
        String result = "";

        for (int i = 0; i < ex.length(); i++) {

            // result = result + ex.charAt(i);  IF THIS IS BEFORE THE 'CONTINUE', IT WILL PRINT THE FULL STRING WITH 'L' AND 'A'
            // this is because the L and A are already added into the value of the result string before it is skipped by the if statement below


            if (ex.charAt(i) == 'L' || ex.charAt(i) == 'A') {
                continue;
            }
            result = result + ex.charAt(i); // this is the correct placement for this problem
                                            // this code means  result (which has no value) is equal to the characters at the location of index i.
                                            // so the loops runs "0" which means result now has the value of the first character in the string of ex.
        }
        System.out.println("result = " + result);








    }
}
