package Day_13_WhileLoop;

import java.util.Scanner;

public class Topic3_WhileLoopExample {

    public static void main(String[] args) {


        // write a code where user can do multiple calculations without rerunning the code

        Scanner sc = new Scanner (System.in);

        System.out.println("*********** Welcome to Calculator ***********");

        System.out.println("Please select the operation");

        System.out.println("1: For addiction \n2: For subtraction \n3: For multiplication \n4: For Division \nAny other number to exit");
        int userInt = sc.nextInt();

        while (userInt == 1 || userInt == 2 || userInt == 3 || userInt == 4) {

            System.out.println("Please enter the first number: ");
            double numOne = sc.nextDouble();
            System.out.println("Please enter the second number: ");
            double numTwo = sc.nextDouble();
            if (userInt == 1) {
                double result = numOne + numTwo;
                System.out.println("result = " + result);
            }
            else if (userInt == 2) {
                double result = numOne - numTwo;
                System.out.println("result = " + result);
            }
            else if (userInt == 3) {
                double result = numOne* numTwo;
                System.out.println("result = " + result);
            }
            else{
                double result = numOne / numTwo;
                System.out.println("result = " + result);
            }
            System.out.println("*************************");
            System.out.println("Please select the operation");

            System.out.println("1: For addiction \n2: For subtraction \n3: For multiplication \n4: For Division \nAny other number to exit");
            userInt = sc.nextInt();
        }
        System.out.println("Calculator Terminated");


























    }
}
