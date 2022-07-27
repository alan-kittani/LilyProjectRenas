package Day_8_Scanners;

import java.util.Scanner;

public class Topic4_Scanner_Example {

    public static void main(String[] args) {

        /**
         * Create a calculator
         * ask user to enter first number
         * ask user to enter second number
         * select the operation
         */

        Scanner calc = new Scanner(System.in);

        System.out.println("WELCOME TO CALCULATOR");

        System.out.println("Enter First Number : ");
        double firstNumber = calc.nextDouble();

        System.out.println("Please Enter Second Number : ");
        double secondNumber = calc.nextDouble();

        System.out.println(" 1) Select 1 for Multiplication \n 2) Select 2 for Division \n 3) Select 3 for Addition \n 4) Select 4 for Subtraction");
        int operation = calc.nextInt();

        switch (operation) {

            case 1:
                double result = firstNumber * secondNumber;
                System.out.println("The result is : " +result);
                break;
            case 2:
                double result2 = ((double) firstNumber / secondNumber);
                System.out.println("The result is : " +result2);
                break;
            case 3:
                double result3 = firstNumber + secondNumber;
                System.out.println("The result is : " +result3);
                break;
            case 4:
                double result4 = firstNumber - secondNumber;
                System.out.println("The result is : " +result4);
                break;
            default:
                System.out.println("Invalid Operation");
        }


    }
}
