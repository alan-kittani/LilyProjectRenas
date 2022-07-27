package HOMEWORK;

import java.util.Scanner;

public class Day_12_Homework1_Continue {

    public static void main(String[] args) {

        /**
         * - Write a code where user is asked to enter an integer number
         * - print all the numbers that can NOT be divided by 2, or 5 and Also can be divided by 7 between 1 to entered number(included) (use the Continue Statement)
         */

        Scanner scan = new Scanner(System.in);

        int userNum = scan.nextInt();

        for (int i = 1; i <= userNum; i++) {
            if (i % 7 == 0 && i % 2 == 0 || i % 5 == 0 && i % 7 == 0) {

            }
            else {
                continue;
            }
            System.out.println(i);

        }

















    }
}
