package Day_17_ArraysAgain;

import java.util.Arrays;

public class AnotherArrayExample {

    public static void main(String[] args) {

        // Adding 2 arrays into one

        int [] arrayOne = {2, 3, 4, 5};
        int [] arrayTwo = {3, 4 ,5 ,6, 7};

        int size  = arrayOne.length + arrayTwo.length;

        System.out.println(size);

        int [] arrayThree = new int[size];
        // values for array three - {0, 0, 0, 0, 0, 0, 0}

        for (int i = 0; i < arrayOne.length; i++) {

            arrayThree[i] = arrayOne[i]; // i = 0 : arrayThree[0] (0) = arrayOne[0] (2)

        }
        int k = 0;
        for (int i = arrayOne.length; i < size; i++) {

            arrayThree[i] = arrayTwo[k];
            k++;

        }
        System.out.println(Arrays.toString(arrayThree));





    }
}
