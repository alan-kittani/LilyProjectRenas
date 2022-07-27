package Day_11_Loops;

public class Topic_2_forLoop_Example {

    public static void main(String[] args) {


        /**
         *  Write a code where it prints all the even Numbers between 0 and 100; (100 included)
         *  If a number is divided by 2 with no remainder then it is an even number.
         */
        int totalIteration = 0;
        int i;
        int evenNumbers = 0;

        System.out.println("Even Numbers : ");
        for (i = 0 ; i <= 100 ; i ++) {  // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,.... 101
            totalIteration++;

            if (i % 2 == 0) {
                System.out.print(+i + " ");   ; // 0, 2, 4, 6, 8
                evenNumbers++;


            }

        }
        System.out.println("\nTotal Even Numbers = " + evenNumbers);
        System.out.println("Total Iterations: " +totalIteration);

        // this is a second way to do it
        System.out.println("\nThis is a second way to do the problem");
        int loopCount = 0;
        for(int alan = 0 ; alan<=100 ; alan+=2){
            System.out.print(alan + " ");
            loopCount++;
        }
        System.out.println("\nTotal Iteration for the second way: " +loopCount);



























    }
}
