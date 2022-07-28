package Day_17_ArraysAgain;

import java.util.Arrays;

public class ArrayStringCHARMethod {

    public static void main(String[] args) {

        // String name  = "AlanKittani"
        // name.toCharArray() --> this will get all the characters into the char [] array

        String myName = "AlanKittani";

        char [] nameArray = myName.toCharArray();

        System.out.println("nameArray = " + Arrays.toString(nameArray));

        // note: space is considered a char and will be added as a char

        String myBrother = "Saman + Kittani";

        char [] brotherArray = myBrother.toCharArray();

        System.out.println("brotherArray = " + Arrays.toString(brotherArray));


    }
}
