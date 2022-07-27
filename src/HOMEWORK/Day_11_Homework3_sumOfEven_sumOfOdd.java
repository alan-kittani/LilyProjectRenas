package HOMEWORK;

import java.util.Scanner;

public class Day_11_Homework3_sumOfEven_sumOfOdd {

    public static void main(String[] args) {

        /**
         * Write a code where user is asked to enter a number.
         * Find the sum of all the even numbers between 0 to that number (included)
         * Find the sum of all the odd numbers between 0 to that number (included)
         */


        System.out.println("Please Enter a number");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        System.out.println("All numbers between 0 and "+i);
        for (int a = 0; a <= i ; a++) {
            if (a %2 == 0) {
                System.out.print(+a+ " Even ");
                sumEven += a;
            }
            else {
                System.out.println(+a+" Odd");
                sumOdd += a;
            }
        }
        System.out.println("\nSum of Even Numbers: " +sumEven);
        System.out.println("Sum of Odd Numbers: " +sumOdd);




    }
}
