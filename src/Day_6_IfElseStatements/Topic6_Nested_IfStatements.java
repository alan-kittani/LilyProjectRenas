package Day_6_IfElseStatements;

public class Topic6_Nested_IfStatements {

    public static void main(String[] args) {

        /** Nested if statements
         *
         *          if (condition1) {
         *              if (sub-condition1){
         *                  if (sub-sub-condition){
         *                  }
         *             }
         *
         *          }else if (condition2) {
         *              if (sub-condition2){
         *
         *             }
         *
         *          }else {
         *              if (sub-condition4){
         *             }
         *          }
         */

        /*
            if number is zero just print
            if number is even and less than 50 double it
            if number is odd and less than 70 triple it
         */

        int number = 75;

        if (number == 0){

            System.out.println("number = " + number);
        }
        else if (number % 2 == 0){
            if (number < 50){
                number = number * 2;
            }
            else {
                number = number * 4;
            }
        }
        else {
            if (number < 70){
                number = number * 3;

            }
            else {
                number = number * 6;
            }
        }
        System.out.println("number = " + number);


    }
}
