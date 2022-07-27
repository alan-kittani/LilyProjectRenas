package Day_13_WhileLoop;

import java.util.Scanner;

public class Topic4_whileLoop_ContExample {

    public static void main(String[] args) {

        // same example with the previous, but using while(true)

        Scanner sc = new Scanner(System.in);
        System.out.println("*********** Welcome to Calculator ***********");

        System.out.println("Please select the operation");

        System.out.println("1: For addiction \n2: For subtraction \n3: For multiplication \n4: For Division \nAny other number to exit");
        int userInt = sc.nextInt();

        while(true) {
            if (userInt == 1) {
                System.out.println("Please enter first number: ");
                double num1 = sc.nextDouble();
                System.out.println("Please Enter Second Number: ");
                double num2 = sc.nextDouble();
                System.out.println("The Result is: " +num1 + num2);
            }
            else if (userInt == 2) {
                System.out.println("Please enter first number: ");
                double num1 = sc.nextDouble();
                System.out.println("Please Enter Second Number: ");
                double num2 = sc.nextDouble();
                System.out.println("The Result is: " + (num1-num2));
            }
            else if (userInt == 3) {
                System.out.println("Please enter first number: ");
                double num1 = sc.nextDouble();
                System.out.println("Please Enter Second Number: ");
                double num2 = sc.nextDouble();
                System.out.println("The Result is: " +num1 * num2);
            }
           else if (userInt == 4) {
                System.out.println("Please enter first number: ");
                double num1 = sc.nextDouble();
                System.out.println("Please Enter Second Number: ");
                double num2 = sc.nextDouble();
                System.out.println("The Result is: " +num1 / num2);
            }
           else {
               break;
            }
            System.out.println("Please select the operation");

            System.out.println("1: For addiction \n2: For subtraction \n3: For multiplication \n4: For Division \nAny other number to exit");
             userInt = sc.nextInt();
        }

        System.out.println("Calculator Off");








    }
}
