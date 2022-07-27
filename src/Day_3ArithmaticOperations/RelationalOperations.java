package Day_3ArithmaticOperations;

public class RelationalOperations {

    public static void main(String[] args) {

        int number = 10;

        // 1st logical expression: ==
        // == sort of asking if its equal, so the options are either true or false if we use double equal signs.
        boolean b1 = 10 == 10;
        System.out.println(b1);
        boolean b2 = 10 == 20;
        System.out.println(b2);
        boolean b3 = ">" == "<";
        System.out.println(b3);
        boolean b4 = "Alan" == "alan";
        System.out.println(b4);

        // 2nd logical expression: >=
        // >= Compares 2 things, and if it is greater or equal, it will return true, otherwise it is false.
        boolean b5 = 12 >= 10;
        System.out.println(b5);
        boolean b6 = 12 >= 200;
        System.out.println(b6);

        // 3rd logical expression: <=
        // <= Compares 2 things, if it is less or equal, it returns as true, otherwise it is false.
        boolean b7 = 14 <= 15;
        System.out.println(b7);
        boolean b8 = 17 <= 16;
        System.out.println(b8);

        // 4th logical expression: !=
        // != Compares 2 things, if they are NOT equal, it will return true, otherwise it is false.
        boolean b9 = 14 != 14;
        System.out.println(b9);
        boolean b10 = 27 != 23;
        System.out.println(b10);

        // 5th logical expression: >
        // > Compares 2 things, and if one is greater than the other, it will be true, otherwise it will be false.
        boolean b11 = 20 > 19;
        System.out.println(b11);
        boolean b12 = 20 > 21;
        System.out.println(b12);

        // 6th logical expression: <
        // Compares 2 things, if one is less than the other, it will be true, otherwise it will be false.
        boolean b13 = 20 < 19;
        System.out.println(b13);
        boolean b14 = 10000 < 1000000;
        System.out.println(b14);

        boolean b15 = true == false;
        System.out.println(b15);

        boolean b16 = !(true == false);
        System.out.println(b16);

        // ! <-- consider this as a negative sign, it will convert a true or false answer to the opposite.

        boolean b17 = !((true == false) == !(10<=11));
        System.out.println(b17);

        boolean b18 = !(('C' == 'c') == (13 == 14) == !("er" == "ER") == (true == true));
        System.out.println(b18);


    }
}
