package Day_12_BreakStatement;

public class Topic1_breakStatement {

    public static void main(String[] args) {


        for (int i = 0 ; i < 300 ; i++) {
            System.out.println("speed " +i);

            if (i == 75) {
                break;
            }
        }


        // for loop shortcut : fori

        for (int speed = 0; speed < 300; speed++) {
            System.out.println("speed " +speed);

            if (speed == 1) {    // if java catches the condition it will stop the loop
                break;
            }
        }

        System.out.println("**********************");

        for (int i = 1 ; i < 9 ; i++) {
            // i=1
            // i=2
            // i=3
            // i=4
            // i=5
            // i=6
            System.out.println(i);

            // i=2 true && false
            // i=6 true && true
            if (i % 2 == 0 && i%3 == 0) {
                break;
            }
        }













    }
}
