package HOMEWORK;

public class Homework_8_array_minimum {

    public static void main(String[] args) {

        /**
         * - Write a code with following requirements:
         * - Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
         * - Print the minimum number in the given array
         */

        int [] list = {6,7,2,3,90,-2,-90,-122,96,35};

        int minimumValue = list[0];

        for (int i = 0; i < list.length; i++) {

            if (minimumValue > list[i]) {
                    minimumValue = list[i];
            }


        }
        System.out.println(minimumValue);

































    }
}
