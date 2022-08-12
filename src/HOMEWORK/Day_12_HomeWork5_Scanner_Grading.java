package HOMEWORK;

import java.util.Scanner;

public class Day_12_HomeWork5_Scanner_Grading {

    public static void main(String[] args) {

        /**
         * -Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
         * - based on the point the code should automatically determine the grade of Student with the full name of the student
         * - This should be done for each student
         * - Assuming we do not know how many student are there but your code should still handle this situation
         * -  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
         * - When the point is between 90 and 100 the grade should be A
         * - When the point is between 80 and 90(excluded) the grade should be B
         * - When the point is between 70 and 80(excluded) the grade should be C
         * - When the point is between 60 and 70 (excluded) the grade should be D
         * - When the point is less than 60 the grade should be F
         * - Example output (First Name = Ziya Last Name = Yilmaz Grade: A )
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Write the first name: ");

        String fName = input.nextLine();

        System.out.println("Write the last name: ");
        String lName = input.nextLine();

        System.out.println("Write the student's score");

        int studentGrade = input.nextInt();

        




























    }
}
