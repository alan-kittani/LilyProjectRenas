package HOMEWORK;

import java.sql.Array;

public class Homework_9_arrays_dividing {

    /**
     * - write a code with following requirements
     * - define an array with following values {90,34,23,87,45,36,98}
     * - Print the values that can be divided by 2 or 3
     */

    public static void main(String[] args) {

        int [] array = {90,34,23,87,45,36,98};



        for (int i = 0; i < array.length; i++) {

            if (array[i] %2 == 0 && array[i] %3 == 0) {

                System.out.println("Digits disible by 2 and 3 : " +array[i]);
            }

        }


























    }
}
