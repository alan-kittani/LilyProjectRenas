package Day_20_Methods_With_Return_Params;

public class Topic3_ReturnTypesExample {


    // write a method where it gets an array of int as input parameters and return to the max number in array


    public static void main(String[] args) {

        int [] arr1 = {-90, -30, -20, -35, 0, 5};
        int maximum = maxMethod(arr1);
        // doing this makes it so we dnt need to repetitively call the maxMethod

        System.out.println("The max value is: " +maximum);

        System.out.println("The other way of printing it : " +maxMethod(arr1));
        // add 5 to the max

        int addedVersion = maxMethod(arr1)+5;
        System.out.println("added version is : " +addedVersion);


    }

    // the method starts here

    public static int maxMethod (int [] maxArray) {
        int max = maxArray[0];
        for (int alan : maxArray) {

            if (max < alan) {
                max = alan;
            }
        }
        return max;
    }




























}

