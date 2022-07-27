package Day_6_IfElseStatements;

public class Topic3_TernaryExample {

    public static void main(String[] args) {

        // Check if number is even or odd

        int num = 91;
        String result;

        /** if (num % 2 == 0) {

            result = "Even";
        }
        else result = "Odd";

        System.out.println("The number is: "+result);
        */

        result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);









    }
}
