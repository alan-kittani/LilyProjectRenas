package Day_6_IfElseStatements;

public class Topic4_MultipleTernary {

    public static void main(String[] args) {

        /**
         * number is 0 just say zero
         * if it is even just say even
         * if it is odd just say odd
         */

        int num = 0;
        String result;

        /**
        if (num == 0) {

            result = "zero";
        }

        else if (num % 2 == 0){

            result = "Even";
        }

        else result = "Odd";
         */

        result = (num == 0) ? "Zero" : (num % 2 == 0) ? "Even" : "Odd";

        System.out.println("result = " + result);


    }
}
