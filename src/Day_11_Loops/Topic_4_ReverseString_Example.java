package Day_11_Loops;


import java.util.Scanner;

public class Topic_4_ReverseString_Example {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);  // Scanner taking the users input.

        System.out.println("Please enter a word or phrase: ");
        String fromScan = scan.next();

        for (int i = 0 ; i < fromScan.length() ; i ++) {

            if (fromScan.charAt(i) == 'A' || fromScan.charAt(i) == 'a') {
                fromScan = fromScan.toUpperCase(); // Then make all to upper case.
                System.out.println(fromScan);

            }
            else {
                fromScan = fromScan.toLowerCase(); // make it lower case.
                System.out.println(fromScan);
            }
        }

        System.out.println("\n" +fromScan); // the last value of the fromScan.
        // The last Char is deciding the last value of FromScan String to be either upper or lower case.
        // If the last char is not 'A' or 'a', then the string will be all lowercase.





















    }
}
