package Day_5_IfStatements;

public class Topic6_IfElse_Example {

    public static void main(String[] args) {


        String person1Name = "Alan";
        float person1H = 5.23233f;
        int person1Age = 21;

        if (person1H > 6 || person1Age < 24) {
            System.out.println(person1Name + " has been accepted for basketball");
        }
        else {
            System.out.println(person1Name + " is not qualified");
        }

    }
}
