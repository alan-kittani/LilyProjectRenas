package Day_6_IfElseStatements;

public class Topic2_Ternary {

    public static void main(String[] args) {

        // Write a code where it checks 2 numbers and assign the bigger to variable called max

        int number1 = 50;
        int number2 = 700;
        int max;

        if (number1 > number2) {
            max = number1;
        }
        else max = number2;

        System.out.println("max = " + max);

        // Ternary max = (number1 > number2) ? number1:number2

        max = (number1 > number2) ? number1 : number2;
                             //   ? if      : else


        System.out.println("This is the second line: " +max);


    }
}
