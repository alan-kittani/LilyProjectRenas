package Day_16_arraysCONT;

import java.util.Arrays;

public class NewTopic_ArraysUtility {

    public static void main(String[] args) {

        /**
         *      Arrays have a utility from java library
         */

        int [] name = {3, 4, 5, 2, 1, -90, -230};

        for (int i = 0; i < name.length; i++) {

            System.out.println(name[i]);

        }
        System.out.println("array: " +name);

        System.out.println(Arrays.toString(name)); //Arrays.toString(arrayName) will change the format, we are not actually converting the integer array into a string
                                                    // this allows the print to be readable

        System.out.println("----------------------------------------------");

        String [] alan = {"saman", "seepan", "leezan"};

        System.out.println(alan);

        System.out.println(Arrays.toString(alan));













    }
}
