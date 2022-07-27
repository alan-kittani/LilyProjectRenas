package Day_15_ArrayIntro;

import java.util.Random;

public class Topic5_MaxNumberInArray {

    public static void main(String[] args) {


        // find the max value inside your array of integers

        int [] boop = new int[6];

        for (int i = 0; i < boop.length; i++) {
            Random ran = new Random();
            boop[i] = ran.nextInt();

        }
        int max = boop[0];

        for (int k = 0; k < boop.length; k++) {

            if (max < boop [k]) {
                max = boop [k];
            }


            
        }
        System.out.println("Max value in the boop array is: " +max);



















    }
}
