package Day_15_ArrayIntro;

import java.util.Random;

public class Topic3_ArrayContinued {

    public static void main(String[] args) {


        int [] nums = {2, 3, 4, 1, 2, 3, 5, 6, 7, 121, 2323};
        System.out.println("the first number is : " +nums [0]);

        nums [0] = 200;  // this will reassign the value at index 0 in the nums array from the value of 2 to 200

        System.out.println("the first number is : " +nums [0]);

        // you should know the size of your array beforehand

        /**
         *     if I want to initialize an array but assign the values later, we can:
         *     int [] name = new int [size]
         */

        int [] numbers = new int [10];  // {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}

        // java will create an array that has the default values for each index.

        // the default values are 0 for (int, byte , long) 0.0 (float, double)

        float [] floatNumbers = new float [3]; // {0.0, 0.0, 0.0}

        String [] strings = new String [3]; // {null, null, null}

        char [] CH = new char[4]; // { , , , };








































    }
}
