package Day_4_Operators;

public class Unary_Operations {

    public static void main(String[] args) {

        // Unary Plus: (+) It does NOT have any effect on the number;
        int number = 10;
        number = +number;

        int number1 = -10;
        number1 = +number1;
        System.out.println(number1);

        // Unary Minus (-) // it will change the sign or the value to be opposite
        int number2 = -20;

        number2 = -number2;
        System.out.println(number2);

        int number3 = 30;
        number3 = -number3;
        System.out.println(number3);

        // Increment  Operators (++) It increase the number by 1;
        int number4 = 8;
        number4++; //number4 = number4 + 1;
        ++number4;
        System.out.println(number4);

        // Decrement Operators (--) it will decrease the number by 1;
        int number5 = 30;
        number5--; // number5 = number5 - 1:
        System.out.println(number5);

        --number5;
        System.out.println(number5);

        // Invert (!) It inverts the boolean values. If it is true, it will be false. If it is false, it will be true.
        boolean bool = true;
        bool = !bool;
        System.out.println(bool);





    }
}
