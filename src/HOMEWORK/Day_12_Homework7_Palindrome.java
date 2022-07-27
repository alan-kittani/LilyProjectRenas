package HOMEWORK;

import java.util.Scanner;

public class Day_12_Homework7_Palindrome {

    public static void main(String[] args) {

        /**
         * Write code where:
         * - User is asked to enter a string,
         * - Use that string to see how many of 3 character substring is Palindrome
         * - Print All the substring Palindrome Substrings
         * - Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
         * PS = This is a little hard question please give your best and make sure you only use the things we have learned so far.
         */

        // length - 3

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter a String :");

        String userString = input.next();

        int countPalindrome = 0;

        // Palindrome is 3 letters that are the same if u go from left to right or right to left:  ex "ana" "ana"

        for (int i = 0; i <= userString.length()-3; i++) {

            String subStr = userString.substring(i , i + 3);  // starting is included but the endpoint is not
            String reverseSub = "";

            for (int j = subStr.length()-1; j >= 0; j--) {

                reverseSub = reverseSub + subStr.charAt(j);


            }
            if (reverseSub.equals(subStr)) {
                countPalindrome++;
                System.out.println("The P sub is : " +subStr);
            }

        }
        System.out.println("The total count of Palindrome substring with 3 characters: " +countPalindrome);
























    }
}
