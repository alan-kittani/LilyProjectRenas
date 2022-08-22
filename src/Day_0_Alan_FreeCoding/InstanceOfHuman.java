package Day_0_Alan_FreeCoding;


import java.util.Scanner;

public class InstanceOfHuman {

    //Scanner input = new Scanner();

    public static void main(String[] args) {

        Human firstHuman = new Human();
        firstHuman.setEssentials(36,"Adam", "Eve");
        firstHuman.setNonEssentials("QA Engineer", "Male", 6.9, 190.90);
        firstHuman.printJobHeightWeight();
        // this will run the code block for THIS HUMAN INSTANCE, FOR THIS PERSON
        int AdamAge = firstHuman.getAge();

        System.out.println("AdamAge = " + AdamAge);

        System.out.println("The Human is : " +firstHuman); // this wil return hashCODE

        System.out.println("The name for Human Instance : " +firstHuman.getName());

        System.out.println("The age is : " +firstHuman.age);





    }

}
