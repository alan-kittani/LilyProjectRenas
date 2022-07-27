package Day_6_IfElseStatements;

public class Topic5_TernaryExample2 {

    public static void main(String[] args) {

        /**
         * Points > 100 or < 0 : Invalid
         * 90 - 100 : Grade A
         * 80-90 : Grade B
         * 70-80 : Grade C
         * 60-70 : Grade D
         * 50-60 : Grade F
         * Less than 50 : Grade failed
         */

        String grade;
        float point = -0.1f;

        grade = (point < 0 || point > 100) ? "Invalid" : (point >= 90 && point <=100) ? "A" :
                (point < 90 && point >= 80) ? "B" : (point < 80 && point >= 70) ? "C" :
                        (point < 70 && point >= 60) ? "D" : (point < 60 && point >= 50) ? "F" : "failed";

        // WE WILL MOSTLY USE ' IF ELSE ' statements because it is easier to read and understand.



        System.out.println("grade = " + grade);


    }
}
