package Day_11_Loops;

public class Topic_1_ForLoop_Continued {

    public static void main(String[] args) {


        /** for (start point ; endpoint ; iteration) {
         *      }
         *      if the condition is met, the code block will run.
         *      This is how we declare for loop.
         */

        /** Write a for loop that increase by 2 for each iteration
         */


        /*
        for (int i = 1 ; i < 100; i+=2) {  // i = 1, 3 , 5 ........ 101
            System.out.println(+i); // 1, 3 , 5 ..... 99

        }
        */

        // Write a code that counts the iterations

        int i;
        int count = 0;
        for (i = 1 ; i <= 20; i+=2) {
            System.out.println("Loop of I : "+i);
            count++;


        }
        System.out.println("Loop Count : " +count);

        System.out.println("The last value of I: " +i);

         /**
          * THE last value of the variable in the loop typically wont print in the loop,
          * And thus the last value of I is here because it did not meet the condition <=20
          */


















        }
}
