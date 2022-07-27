package Day_4_Operators;

public class Primitive_Casting {

    public static void main(String[] args) {

        // Casting from smaller size to bigger size is not an issue
        // However going from bigger size to smaller, we have to specify.
        // Down Casting is NOT recommended.
        // 010101010010 = 300; the 01s read from RIGHT TO LEFT.

        int A = 300;
        byte B = (byte) A;
        System.out.println(B);

        byte number1 = 100;
        int number2 = number1;
        System.out.println(number2);

        byte number3 = (byte) number2;
        System.out.println(number3);

        int number5 = 43653463;
        long nuumber6 = number5;

        long number7 = 124901021395135l;
        int number8 = (int) number7;

        float number9 = 89.9f;
        double number10 = number9;

        int number11 = 3939393;
        float number12 = (float) number11;
        System.out.println(number12);







    }

}
