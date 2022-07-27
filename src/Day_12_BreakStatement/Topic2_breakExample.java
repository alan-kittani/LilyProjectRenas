package Day_12_BreakStatement;

public class Topic2_breakExample {

    public static void main(String[] args) {

        /**
         *   for (start , and ,iiteration) {
         *   whatever is here will run until the end point
         *
         * }
         *   break is used to break the code
         */

        String hello = "Hello";
        String result = "";
        for(int i = 0 ; i<hello.length(); i++) {
          //  result = result + hello.charAt(i);   the end result for this will be Hel
            if(hello.charAt(i)=='l') {
                break;
            }
            result = result + hello.charAt(i);   // the end result for this will be He
        }
        System.out.println(result);

        System.out.println("-------------------------------------------");

        /** I want to count the numbers from 0 to 50 (included
         *  if my sum is over 140 I want to stop
         */

        int sum = 0;
        for (int i = 0; i <= 50; i++) { // i value : 0, 1, 2, 3, 4, 5, ............ 50.

          //  sum = sum+i; // 0 + 1 + 2 + 3 + 4 + 5 + 6  ...... + 50.  if we put sum BEFORE TH over the 140 in E BREAK it will most cases, but this example doesn't matter
            if (sum >= 140) {
                break;
            }
            sum = sum+i; // 0 + 1 + 2 + 3 + 4 + 5 + 6  ...... + 50.


        }
        System.out.println("Sum: " +sum);

















    }
}
