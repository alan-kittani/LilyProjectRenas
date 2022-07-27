package Day_15_ArrayIntro;

import java.util.Random;

public class Topic4_ArrayExample {

    public static void main(String[] args) {

        // INITILIAZE THE ARRAY (add values)

        int [] myArray = new int [4]; // assigning values to the array (initialize) it is currently {0, 0, 0, 0}

        myArray [0] = 4;
        myArray [1] = 2;
        myArray [2] = 8;
        myArray [3] = 9;

                // this is the manual way to do it

        // if we don't want to add one by one then we can use a loop

        for (int i = 0; i < myArray.length; i++) {

            myArray [i] = i+5;   // numbers [0] = 5
                                //  numbers [1] = 6
                                // numbers [2] = 7
                                // numbers [3] = 8
            // IF WE WANT RANDOM VALUES WE CAN DO
           // Random name = new Random ();
           //  myArray[i] = name.nextInt(100)+1;




        }





    }
}
