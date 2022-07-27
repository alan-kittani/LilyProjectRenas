package Day_12_BreakStatement;

public class Topic3_ContStatement {

    public static void main(String[] args) {

        /**
         *   If you run your code, and it contains cont, it will pass the iteration int for loop
         */


        // I want to print all the numbers between 0 and 10 (not included) except number 3, 6, and 9

        for (int i = 0 ; i < 10 ; i++) { // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 it will increase to 10 but 10 won't go into the loop

          // System.out.println(i); // IF THIS PRINT IS BEFORE THE 'CONTINUE' STATEMENT IT WILL STILL SHOW 3,6,9

            if (i == 3 || i == 6 || i == 9) {
                continue;
            }
            System.out.println("i = " + i); // 1, 2, 4, 5, 7, 8
        }










    }
}
