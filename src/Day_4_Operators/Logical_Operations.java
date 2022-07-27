package Day_4_Operators;

public class Logical_Operations {

    public static void main(String[] args) {

        // AND ==> "&&", If an operation contains AND (&&), in order for the result to be true, all variables should be true
        boolean balls = (12 > 7) && (3 < 8) && (9 >= 7);
        System.out.println(balls);

        boolean flowers = (true) && (3 <= 8) && (8 != 9) && (false);
        System.out.println(flowers);

        // OR ==> "||", if any variables comparisons are true, it will return true. (as long as there is one truth, it will return true)
        boolean flo = (9 > 11) || (6 < 9); // since we have one true, the other false does not matter, and the result is true
        System.out.println(flo);

        boolean shoes = ("Alan" == "alan") || ('C' == 'c'); // since nothing here is true, the variable returns false.
        System.out.println(shoes);

        // NOT "!"
        boolean cars = !("red" == "blue");
        System.out.println(cars); // result is true because "!" is saying the opposite

        boolean Q = !(((4 == 5) || (7 < 9)) && ((8 <= 10) || (true)));
        // in order to solve, consider the "!" last, and work on the inner parenthesis true or false variables first
        System.out.println(Q);







    }
}
