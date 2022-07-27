package Day_13_WhileLoop;

public class Topic6_doWhileExample {

    public static void main(String[] args) {

        /**
         *   Sum all the even numbers from 0 to 100
         */


        int i = 0;
        int total = 0;
        do{
            if (i == 78) {
                i+=2;       // we need to use this to make sure the loop doesn't get stuck at 78
                continue;  // here we disregard 78 because the example wanted to exclude 78
            }
            if (i == 100) {
                break;     // here we can exclude 100 and break the loop before it gets added.
            }
           total = total + i;
           i = i + 2;   // it is good to put the incremental after we do our summation (total) code
        }while (i <= 100);

        System.out.println("The sum of all the even numbers = " +total);






















    }
}
