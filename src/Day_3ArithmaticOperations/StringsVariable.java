package Day_3ArithmaticOperations;

import java.sql.SQLOutput;

public class StringsVariable {
    public static void main(String[] args) {

        // String is not a primitive data type.

        String name = "123431423"; // This is a text not a number
        String name2 = "Alan"; // This is also a text

        String name3 = name+name2;
        System.out.println(name3);

        String name4 = name + " Likes to learn " + name2;
        System.out.println(name4);

        System.out.println("This is name2: " + name2);
        int a = 8;

        System.out.println("This is the number a: " +a);

        float numf2 = 7.9f;

        System.out.println("This is the float number: " +numf2);

        String thisisatext ="Alan Kittani 123123123123";

        char ch = 'R';
        String st ="Toys" + "-" + ch + "-" + "Us";
        System.out.println(st);

        int numnum = 34;
        String nam20 = "This is us";
        String nam30 = nam20 + " " + numnum;
        System.out.println(nam30);



    }
}
