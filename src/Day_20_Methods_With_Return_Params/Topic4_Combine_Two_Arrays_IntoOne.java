package Day_20_Methods_With_Return_Params;

import java.util.Arrays;

public class Topic4_Combine_Two_Arrays_IntoOne {

    // write a method where it takes two int arrays as input parameters and combine those two arrays and returns to one
    // int array


    public static int [] methodForArray(int [] placeholderOne, int [] placeholderTWO){
        int size = placeholderOne.length + placeholderTWO.length;
        int [] arrayThree = new int [size];
        for (int i = 0; i < placeholderOne.length; i++) {
            arrayThree[i] = placeholderOne[i];
        }
        int j = 0;
        for (int i = placeholderOne.length; i < size; i++) {
            arrayThree[i] = placeholderTWO[j];
            j++;

        }
        return arrayThree;
    }

    public static void main(String[] args) {



        int [] arrayOne = {2, 3, 1, 90, 23, 43, 54, 23, 13, 45, 65, 67};
        int [] arrayTwo = {30, 7, 13, 18, 37, 45, 21, 1905};

        methodForArray(arrayOne, arrayTwo);

        int [] bothArrays = methodForArray(arrayOne,arrayTwo);
        System.out.println(Arrays.toString(bothArrays));














    }




}
