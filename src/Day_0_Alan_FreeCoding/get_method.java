package Day_0_Alan_FreeCoding;

import java.sql.Array;
import java.util.ArrayList;

public class get_method {

    public static void main(String[] args) {

        // get (index) -- > it is used to get a specific object from the index.

        ArrayList <Integer> alan = new ArrayList<>();

        alan.add(1);
        alan.add(5);
        alan.add(5);

        int num1 = alan.get(0);
        System.out.println(num1);
    }
}
