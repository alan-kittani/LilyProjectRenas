package HOMEWORK;

import java.util.Scanner;

public class Day_12_Homework2_Strings {

    public static void main(String[] args) {

        /**
         * - Write a code where user is asked to enter a string 
         * - create a new string with entered string but do not include 'L' 'M', 'T' 'E' in the new string
         * - print the new string
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word or phrase");
        
        String userString = scan.nextLine();
        
        String newString = "";

        for (int i = 0; i < userString.length(); i++) {


            if (userString.charAt(i) == 'L' || userString.charAt(i) == 'M' || userString.charAt(i) == 'T' || userString.charAt(i) == 'E') {
                continue;

            }
            newString = newString + userString.charAt(i);






            
        }
        System.out.println(newString);



    }
}
