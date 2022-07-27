package HOMEWORK;


import java.util.Scanner;

public class Day_11_Homework1_Factorial {

    public static void main(String[] args) {


        /**
         * Write a code where user is asked to enter an integer number:
         *  1) Using the given number find the factorial of that number and Print the result.
         * example: 5 ==> 5! = 5*4*3*2*1 = 120
         */


        System.out.println("Please enter a number");
        Scanner scan = new Scanner (System.in);
        int i = scan.nextInt();
        int factorial = 1;
        if (i < 0) {
            System.out.println("Unable to factorial negative numbers");
        }
        else {
            for (int counter = i ; counter > 0 ; counter -- ) {
                factorial = factorial * counter;
            }
            System.out.printf("%d! = %d", i, factorial);

        }



    }
}
