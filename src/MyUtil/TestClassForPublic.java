package MyUtil;

public class TestClassForPublic {

    public static void fromDiffClass (String fName, String lName) {

        System.out.println("The first name is : " +fName + " " + " the last name is : " +lName);

    }

    public static double Sum (float num1, float num2) {
        double sum = (double) num1+num2;
        return sum;
    }

    protected static void PMethod (){
        System.out.println("This is private method");
    }
}
