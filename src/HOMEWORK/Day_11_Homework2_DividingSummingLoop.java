package HOMEWORK;

import java.util.Scanner;

public class Day_11_Homework2_DividingSummingLoop {

    public static void main(String[] args) {

        /**
         * Write a code where user is asked to enter a number
         * Check for every number between 0 to that number to see how many number between 0 to that number can be divided to 3 and 5 and sum all those number,
         * Print the result
         */

        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int count = 0;
        int sum = 0;

        for (int numbers = 0 ; numbers <= i ; numbers++) {
            if (numbers % 15 == 0) {
                sum += numbers;
                count++;
                System.out.print(" " +numbers);

            }
        }
        System.out.println("\nsum " +sum);





    }
}
