package Day_17_ArraysAgain;

import java.util.Arrays;

public class StringMethodsInArray {

    public static void main(String[] args) {

        /**
         * ONLY A STRING METHOD FOR ARRAYS
         */

        String alanString = "Alan is a student";

        String [] name = alanString.split("_"); // you cannot use ?, +, *
                        // this method will get every substring starting from beginning
                        // sees the char added in the quotes

        System.out.println("the array is: " + Arrays.toString(name));

        System.out.println("-----------------------------");
        String alanStringTwo = "Java_is_cool";
        String [] nameTwo = alanStringTwo.split("_");
        System.out.println("The other array is: " + Arrays.toString(nameTwo));

        // THIS PUTS A COMMA EVERYTIME THE STRING READS A SPACE, if i put a . in the string, IT WILL PUT A COMMA EVERYTIME THERE IS A . IN THE STRING






























    }
}
