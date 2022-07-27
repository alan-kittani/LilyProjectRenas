package Day_16_arraysCONT;

public class ArraysCont {

    public static void main(String[] args) {

        // find the average age of people in the array.

        int [] agesArray = {12, 23 ,43 ,21 , 45, 68};

        int sum = 0;

        for (int i = 0; i < agesArray.length; i++) {

            sum = sum + agesArray[i];
            // the new sum = 0 + 12
            // the second i = 1 ==> sum = 12 + 23


        }
        float averageAge = (float)sum / agesArray.length; // this is primitive casting
        System.out.println("Average age in the array: " +averageAge);












    }
}
