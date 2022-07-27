package Day_6_IfElseStatements;

public class Topic1_IfElseExample_2 {

    public static void main(String[] args) {

        /**
         *  Water temp is 100, it is boiling
         *  Water temp is 0, it is freezing
         *  Water temp is 0 < temp < 10, so cold
         *  Water temp between 10-30, cold
         *  Water temp 60-90, Hot
         *  Water Temp 90 < temp < 100, so Hot
         *  rest, room temp
         */

        String waterCond;
        int temp = -20000000;

            // water temp is 100 it is boiling
        if (temp == 100) {

            waterCond = "Boiling";
            //System.out.println("The water condition is: "+waterCond);
        }
        else if (temp == 0 || temp < 0) {
            // water temp is 0 it is freezing

            waterCond = "Freezing";
            // System.out.println("The water condition is: " +waterCond);
        }
        else if (temp > 0 && temp < 10) {

            waterCond = "So Cold";
            // System.out.println("The water condition is: " +waterCond);
        }
        else if (temp >= 10 && temp < 30) {

            waterCond = "Cold";
            // System.out.println("The water condition is: " +waterCond);
        }
        else if (temp >= 60 && temp < 90) {

            waterCond = "Hot";
            // System.out.println("The water condition is: " +waterCond);
        }
        else if (temp >= 90 && temp < 100) {
            waterCond = "So Hot";
            // System.out.println("The water condition is: " +waterCond);
        }
        else {
            waterCond = "Room temp";
            // System.out.println("The water condition is: " +waterCond);

        }


            // we can also do just one sys out print under the conditional blocks instead of one by one
        System.out.println("The water condition is: " +waterCond);














    }
}
