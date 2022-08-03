package Day_0_Alan_FreeCoding;

import java.util.Scanner;

public class Methods {


    private static int giveMeFive (){
        return 5;
    }

    private static void myName(String intro) {

        System.out.println("Hello " + intro + ", welcome to your world.");




    }

    public static void main(String[] args) {

        myName("Alan");
        int takingFive = giveMeFive();
        System.out.println(takingFive);

    }







}
