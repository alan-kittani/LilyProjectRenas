package Day_11_Loops;

public class Topic_3_ReverseString {

    public static void main(String[] args) {

        /**
         * Strings are indexed, starting from first character being indexed 0
         * The last character of a string has an index of LENGTH -1
         */

        String alan = "Hello";
        /*     alan.charAt(0);
               System.out.println(alan.charAt(0));
         */


            /**
        System.out.println(alan.charAt(alan.length()-1));  // Last char in the string

        System.out.println(alan.charAt(alan.length()-2));  // second to last char in the string

        System.out.println(alan.charAt(alan.length()-3));  // third to last in the string

        System.out.println(alan.charAt(alan.length()-4));  // fourth to last in the string

        System.out.println(alan.charAt(alan.length()-5));  // fifth to last in the string
            */

            String reverse = "";

        for (int i = alan.length()-1; i >= 0 ; i--){  // it will start from the last index (reverse string).

            reverse = reverse + alan.charAt(i);

        }
        System.out.println(reverse);


    }
}
