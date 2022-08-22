package Day_0_Alan_FreeCoding;


// ONLY ONE CLASS CAN HAVE A PUBLIC IN A MULTI CLASS
// this structure is not the best to use though...
// if you are in the same package, you do not need to import
// this structure is optional.


public class multi_Classes {

    public static void wolf(){
        System.out.println("JAJAJJAJAJJAA");
    }
}
class AnotherClass{

    public static void firstName (){
        System.out.println("The first name is : OKDSGKADG");
    }


}
class AndAnotherOne {

    public static void main(String[] args) {

        AnotherClass.firstName();

        multi_Classes.wolf();

    }
}
