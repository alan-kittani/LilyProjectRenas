package Day_9_Strings;

import java.util.Scanner;

public class Day_9_Homework {

    public static void main(String[] args) {

        /**
         *     Write a code where user is asked to enter a Name,
         *
         *     if the name start with “A” and ends with “L”,  Replace “A” with “B” and print the result
         *     If Name Start with “B” and ends with “L” also Contains “A” replace the second character of the name with “G”
         *     If name starts with “C” and ends with “K” , Check is the name is equal to “Clark” or “CLARK”.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = input.nextLine();

        boolean n1 = name.startsWith("A") && name.endsWith("L");
        boolean n2 = name.startsWith("B") && name.endsWith("L") && name.contains("A");
        boolean n3 = name.startsWith("C") && name.endsWith("K");

        int index = name.indexOf(1);
        char ch = 'G';

        if (n1 == true) {
            name = name.replace("A", "B");
            System.out.println("name = " + name);
        }
        else if (n2 == true) {
            name = name.replace(name.charAt(1), 'G');
            System.out.println("name = " + name);
        }
        else if (n3 == true) {
            if (name == "Clark" || name == "CLARK"){
                System.out.println(name);
            }
        }
        else {
            System.out.println("Hello");
        }



    }
}
