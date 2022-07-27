package Day_8_Scanners;

import java.util.Scanner;

public class Topic1_Scanner_Cont {

    public static void main(String[] args) {


        // We are creating a Scanner Object

        Scanner input = new Scanner (System.in);
        // How to scan the short data-type input

        System.out.println("Please enter the short number : ");
        Short sh = input.nextShort();
        System.out.println("The number that user entered is " +sh);


        System.out.println("Please enter the integer number : ");
        int in = input.nextInt();
        System.out.println("The integer number is " +in);


        System.out.println("Please enter the Double number : ");
        double dob = input.nextDouble();
        System.out.println("This is the double number " +dob);


        System.out.println("Please Enter the Float number : ");
        float flo = input.nextFloat();
        System.out.println("This is the float number " +flo);









    }
}
