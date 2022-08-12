package Day_0_Alan_FreeCoding;

public class Human {
    //  CLASS VARIABLES
    int age;
    String firstName;
    String lastName;
    String job;
    String gender;
    double height;
    double weight;

    // these are the class variables
    // we can use these variables throughout the class and methods we have in the class
            // ins = instance, instance age, instance firstname, etc...
    public void setEssentials (int insAge, String insFirstName,String insLastName){
        age = insAge;
        firstName = insFirstName;
        lastName = insLastName;

    }
    public void setNonEssentials (String insJob, String insGender, double insHeight, double insWeight){
        job = insJob;
        gender = insGender;
        height = insHeight;
        weight = insWeight;
    }

    public String getName (){
        return firstName + " " +lastName;
    }
    public int getAge () {
        return age;
    }
    public void printJobHeightWeight() {
        System.out.println("The job is : "+job);
        System.out.println("The height is : "+height);
        System.out.println("The weight is : "+weight);

    }




}
