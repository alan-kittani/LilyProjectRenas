package MyUtil;

public class TestClassForPublic {

    public static void fromDiffClass (String fName, String lName) {

        System.out.println("The first name is : " +fName + " " + " the last name is : " +lName);

    }

    public static double Sum (float num1, float num2) {
        double sum = (double) num1+num2;
        return sum;
    }

    public static void breakLines (){

        System.out.println("---------------------------------");


    }
}
