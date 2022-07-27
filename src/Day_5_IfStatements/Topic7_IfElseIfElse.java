package Day_5_IfStatements;

public class Topic7_IfElseIfElse {

    public static void main(String[] args) {

        int gameNumber = 50;

        if (gameNumber > 100){
            System.out.println("Correct");
        }

        else if (gameNumber < 50) {
            System.out.println("Correct");
        }
        else if (gameNumber == 50) {
            System.out.println("Your number is: " +gameNumber);
        }
            // The next line of code under this comment will NOT run because the condition was already met above this line
        else {
            System.out.println("Print my number : " +gameNumber);
        }


    }
}


