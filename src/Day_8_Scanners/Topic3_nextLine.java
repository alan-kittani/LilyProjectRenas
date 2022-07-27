package Day_8_Scanners;

import java.util.Scanner;

public class Topic3_nextLine {

    public static void main(String[] args) {

        // 2) nextLine() this will read everything on the line and assign it to string

        Scanner input = new Scanner (System.in);


        System.out.println("Please enter your full name : ");
        String hey = input.nextLine();
        System.out.println("hey = " + hey);

        // We do not have a scanner input for "char" variable because it is already covered in string variable

    }
}
