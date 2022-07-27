package HOMEWORK;

import java.util.Scanner;

public class Day_12_Homework3_Sums {

    public static void main(String[] args) {

        /**
         * - Write a code where user is asked to enter a number
         * - Print the even sum of the even numbers from 0 to entered number(included) but the Sum should not pass 390
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");

        int userInt = input.nextInt();

        int evenSum = 0;

        for (int i = 0; i <= userInt; i++) {

            if (i %2 == 0) {
                evenSum += userInt;
            }
            
        }
        if (evenSum > 390) {
            System.out.println("Exceeds limit of 390");
        }
        else {
            System.out.println("evenSum = " + evenSum);
        }






    }
}
