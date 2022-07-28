package Day_17_ArraysAgain;

import java.util.Arrays;

public class ArrayExampleAgain {

    public static void main(String[] args) {

        /**
         *    write a code where it will get all the words in a string and put it into an array and then reverse the words
         */

        String strOne = "Tracy is cool";

        String [] arrayOne = strOne.split(" ");

        System.out.println("The array: " + Arrays.toString(arrayOne));

        // we want {cool, is , tracy}

        String [] reverseArray = new String [arrayOne.length]; // reverseArray = {null, null, null}

        int k = 0;
        for (int i = arrayOne.length-1; i >= 0; i--) {

            reverseArray[k] = arrayOne[i];
            k++;

        }
        System.out.println(Arrays.toString(reverseArray));

        System.out.println(arrayOne.length);


        /**
         *     there is outplace reversing and in place reversing
         *     we just did outplace reverse
         *     this is in place reverse
         */























    }
}
