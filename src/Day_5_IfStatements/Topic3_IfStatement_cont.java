package Day_5_IfStatements;

public class Topic3_IfStatement_cont {

    public static void main(String[] args) {
        /* Let's define 3 different numbers
        We will print the max number by using logical operations and if statement
        Write a code where is compares 3 diff numbers and print the maximum number
         */

         int number1 = 199;
         int number2 = 27;
         int number3 = 189;

         /*boolean bool1 = number1 > number2 && number1 > number3;
         boolean bool2 = number2 > number1 && number2 > number3;
         boolean bool3 = number3 > number1 && number3 > number2;

         */

        // Instead of using a lot of variables like booleans to run the if statement blocks, we can just put the statement inside the if variable


        if (number1 > number2 && number1 > number3){
             System.out.println("The max number is: " +number1);
         }
         if (number2 > number1 && number2 > number3){
             System.out.println("The max number is: " +number2);
         }
         if (number3 > number1 && number3 > number2){
             System.out.println("The max number is: " +number3);
         }


    }
}
