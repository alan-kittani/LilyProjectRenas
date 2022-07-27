package Day_16_arraysCONT;

import java.util.Arrays;

public class ArraysUtilityContinued {

    public static void main(String[] args) {

        /**
         *      Arrays.sort(array)
         *      this will sort in incrementing order
         */

        int [] sortArray = {90, 3423, 234, 324234, 23};

        Arrays.sort(sortArray);

        for (int i = 0; i < sortArray.length; i++) {

            System.out.println(sortArray[i]);

        }

        System.out.println("------------------------");

        System.out.println(Arrays.toString(sortArray));

        System.out.println("------------------------");;

        int [] srt2 = {24,232,23,1,2242,23};

        //   System.out.println(Arrays.sort(srt2).);  // we cannot print this, this utility simply orders the array for us, and we can print it with array.toString

        String [] namesSorting = {"Alan", "Saman", "Seepan", "Leezan"};

        Arrays.sort(namesSorting);

        System.out.println(Arrays.toString(namesSorting));

        /**
         *   int [] num = {1,5,3,6,2,4,7};
         *
         *         Arrays.sort(num);
         *
         *         int [] num1 = num;
         *
         *         System.out.println(Arrays.toString(num1));
         *
         *         we might need this some day, but its very niche
         */












    }
}
