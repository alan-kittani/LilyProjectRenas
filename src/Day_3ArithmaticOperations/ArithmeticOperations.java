package Day_3ArithmaticOperations;

public class ArithmeticOperations {

    public static void main(String[] args) {
        // Addition (+) it is used to add numbers;

        int num1 = 10;
        int num2 = 20;
        float numf1 = 40.7f;
        double numd1 = 76.454694;
        long numl1 = 43843984938539853l;

        // int number 3 = number 1 + numberf1; will throw error because the answer must be a float


        float number3 = num1 + numf1;
        float float1 = 10.6f;
        float float2 = 5.4f;

        float num3 = float1+float2;

        System.out.println(num3);

        System.out.println(num1 + num1);

        System.out.println(number3);

        // System.out.println(number1 + number2);

        // Subtraction (-)

        int int4 = 50;
        int int5 = 70;
        // int int6 = int4 - int5;
        // System.out.println(int6);
        System.out.println(int4 - int5);

        int int7 = 80;
        float f1 = 90.6f;
        System.out.println(int7 - f1);

        long l2 =  492052945l;
        int int11 = 786;
        long num6 = l2 + int11;
        System.out.println(num6);

        // multiplication (*)
        int multi1 = 20;
        int multi2 = 30;
        int multi3 = multi1 * multi2;
        System.out.println(multi1 * multi2);
        System.out.println(multi3);

        // Division (/)
        int divis1 = 60;
        int divis2 = 30;
        int divis3 = divis1 / divis2;
        System.out.println(divis3);

        int divis4 = 4;
        int divis5 = 3;
        float divis6 =(float) divis4 / divis5;
        System.out.println(divis6);
        System.out.println(divis4/divis5);

        // modulus (%), it gives you the remainder

        int mod1 = 10;
        int mod2 = 5;
        int mod3 = 10%5;
        System.out.println(mod3);

        int mod4 = 11;
        int mod5 = 5;
        System.out.println(mod4%mod5);

        float mod6 = 5.8f;
        int mod7 = 2;
        float mod8 = mod6%mod7;
        System.out.println(mod8);
    }
}
