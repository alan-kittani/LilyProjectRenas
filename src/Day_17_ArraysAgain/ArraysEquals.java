package Day_17_ArraysAgain;

import javax.sound.sampled.Line;
import java.util.Arrays;

public class ArraysEquals {

    public static void main(String[] args) {


        // Arrays are objects, they contain multiple values

        // In order for 2 arrays to equal to each other, they need to have the same values in the same order

        int [] arrayOne = {1, 2, 3, 4};
        int [] arrayTwo = {2, 1, 3, 4};

        System.out.println(Arrays.equals(arrayOne, arrayTwo));
        // prints "false"

        if (Arrays.equals(arrayOne, arrayTwo)) {
            System.out.println("hi");
        }
        else {
            System.out.println("bye");
        }

        boolean arrayEqual = Arrays.equals(arrayOne, arrayTwo);

        System.out.println("Is array one equal to array two? " +arrayEqual);

        int [] arrayThree = {2, 3, 6 , 9};
        int [] arrayFour = arrayThree;

        System.out.println(Arrays.toString(arrayThree));
        System.out.println(Arrays.toString(arrayFour));

        System.out.println(Arrays.equals(arrayThree, arrayFour));





























    }
}
