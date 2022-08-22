package HOMEWORK;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework_6_Reverse_Integer {



    public static void main(String[] args) {

        /**
         * reversing an integer number
         * Write a code where it ask user to enter an integer number
         * - Reverse the given number and print the result
         * - Example input ( 5678 )
         * - Example output ( 8765 )
         */

        //int myNumber = 12; //21

        Scanner scan = new Scanner(System.in);

        int myNumber = scan.nextInt();

        int reverseOfA = 0;

        System.out.println("Before Reverse : " +myNumber);

        while (myNumber !=0) {
            // 12 != 0

            int lastDigit = myNumber %10; // 2
            //  1 % 10 > 1

            reverseOfA = reverseOfA *10 +lastDigit;
            //         = 0  *10  +2 (lastDigit)
            //         = 2   *10 == 20 +1

            myNumber = myNumber/10;
            // 1
            //   = 1 / 10 == 0.1

        }

        System.out.println("After Reverse : " +reverseOfA);





























    }



}