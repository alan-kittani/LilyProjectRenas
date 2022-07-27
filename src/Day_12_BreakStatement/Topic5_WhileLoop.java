package Day_12_BreakStatement;

public class Topic5_WhileLoop {

    public static void main(String[] args) {

        /**
         *         the concept of white loop
         *       We define the starting point before the "while"
         *       You have the condition in the while (endpoint)
         *       you have the iteration inside the curly brackets
         *
         *          Steps
         *  1)     int i = 0
         *  2)     while (condition i < 10) {
         *  3)     i++ or i-- or i+=10 or .....
         */

        /*
           *for (int i = 0; i < 10; i++) {
           *System.out.println(i);
           *    }
        */

        int i = 0;
        while (i<10) {
            System.out.println(i);
            ++i;
        }

        /**
         * Which is better for loop or while loop?
         * Use a for loop when you know the loop should execute n times.
         * Use a while loop for reading a file into a variable.
         * Use a while loop when asking for user input.
         * Use a while loop when the increment value is nonstandard.
         */















    }
}
