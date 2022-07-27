package Day_10_Strings_Continued;

import java.util.Scanner;

public class Topic_2_Example {

    public static void main(String[] args) {

        /**
         * User is asked to put a valid email (username).
         * Email must be a gmail address.
         * Enter a password where the password is at least 9 char.
         */

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a valid email address: ");
        String email = input.next();

        System.out.println("Enter Password, must be at least 9 Characters: ");
        String password = input.next();

        String formattedEmail = email.toLowerCase();

        if (!(formattedEmail.startsWith("@")) && formattedEmail.endsWith("@gmail.com")) {
            System.out.println("Email is valid");
        }
        else {
            System.out.println("Invalid email");
        }
        if (password.length() >= 9) {
            System.out.println("password is valid");
        }
        else {
            System.out.println("Invalid password");
        }













    }
}
