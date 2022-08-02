package Day_19_Methods;

import java.util.Scanner;

public class Topic5_MethodExamples2 {

    /**
     * write a method that has 3 input parameters
     * Find the max number between those 3 numbers
     */

    public static void myFunc(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else{
            max = c;
         }
        System.out.println("max = " + max);
    }

    private static void cMyFunc() {

        myFunc(18, 29, 0);

    }

    public static void main(String[] args) {

        cMyFunc();

    }



}


