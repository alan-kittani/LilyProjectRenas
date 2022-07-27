package Day_13_WhileLoop;

public class Topic5_doWhileLoop {

    public static void main(String[] args) {

        /**
         *     The concept do while Loop is
         *   do{
         *   code block
         *  }while (condition);
         */


        int i = 3000;

        do {
            System.out.println("The i value = " +i);
            i++; // i = i + 1
        }while (i < 10);  // this is the EXIT CONDITION, the first i value will always print even if this condition isn't met

        /*int j = 0;
        while (j<10){
            j++;

        }
         */
        int j = 10;
        System.out.println("------------------------------------");
        do {
            if (j < 10) {
                System.out.println("The j value = " + j);
                j++; // i = i + 1
            }
        }while (i < 10) ;








    }
}
