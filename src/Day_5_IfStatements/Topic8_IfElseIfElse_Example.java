package Day_5_IfStatements;

public class Topic8_IfElseIfElse_Example {

    public static void main(String[] args) {

        /* 100 - 90 will result A grade
            89 - 80 will result B grade
            79 - 70 will result C grade
            69 - 60 will result D grade
            59 - 0 will result F grade
         */
        // The use of && (and) is to define a range, however you do not need an && statement
        //     because it will disregard the rest of conditions once the first one meets the condition
        int Point = 90;
        if (Point >= 90){
            System.out.println("A");
        }
        else if (Point >= 80 && Point < 90) {
            System.out.println("B");
        }
        else if (Point >= 70 && Point < 80) {
            System.out.println("C");
        }
        else if (Point >= 60 && Point < 70) {
            System.out.println("D");
        }
        else
            System.out.println("F");


    }


}
