package HOMEWORK;

import java.util.Scanner;

public class Day_11_Homework5_SquaringNumbers {

    public static void main(String[] args) {

        /**
         * Write a code where user is asked to enter a number:
         * Calculate the square of all the numbers from 0 to given number and print the result for each number,
         * (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)
         */

        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();
        int numSquare = 0;

        for (int i = 0; i < userNum; i++) {
            numSquare = i *i;
            System.out.println(i+" ^2 = " +numSquare);

        }













    }
}
