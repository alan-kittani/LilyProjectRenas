package Day_15_ArrayIntro;

import java.util.Arrays;

public class Topic2_CallingArrays {

    public static void main(String[] args) {


        int [] values = {3, 5, 6, 7};

        /**
         *      in order to call on a value in an array, we use index
         *      values[2]; this will return the 3rd value in our array
         */

        System.out.println("The 3rd value in MY ARRAY is : " +values[2]);

        // values[1] will return the second value in my array

        System.out.println("The 2nd value in MY ARRAY is : " +values[1]);


        // if you put a value in the index that exceeds the max of the index it will give an error

        String [] myStringArray = {"Alan" , "Seepan" , "Leezan" , "Saman"};

        System.out.println("My name is: " +myStringArray[0]);

        System.out.println("My brother's name is: " +myStringArray[3]);


        System.out.println("------------------------------");


        String name = "Alan";

        int [] experiment = {1, 2 , name.length()};

        System.out.println(experiment[2]);

        int pop = 1;

        int [] experimentTwo = {3, 4, pop};

        System.out.println(experimentTwo[2]);

        // What if I want to print all the values in an array

        int [] numbers = {3, 5, 6, 7, 5, 6, 6, 8};

        System.out.println("The size of the array is : " +numbers.length);
        
        // this is the size of the array

        System.out.println("size of our array index: " +(numbers.length-1));
        
        // this is the last index of the array

        for (int i = 0; i < numbers.length-1; i++) {
            System.out.print(" " +numbers[i]);
            
        }





































    }
}
