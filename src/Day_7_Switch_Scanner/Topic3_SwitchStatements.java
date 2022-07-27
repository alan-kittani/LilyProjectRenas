package Day_7_Switch_Scanner;

public class Topic3_SwitchStatements {

    public static void main(String[] args) {

        /**
         *  Switch statements work similar to IF statements, but not as common and useful
         *  If we have a lot of conditions to check, then it is a useful tool
         *  Developers DO NOT USE THIS OFTEN
         *  Testers use this for a couple cases, such as browser cases, but only for a few cases
         *
         *  How switch works:
         *      1-The switch expression is evaluated once.
         *      2-The value of the expression is compared with the values of each case.
         *      3-If there is a match, the associated block of code is executed.
         *
         *  Structure:
         *     variable variableName
         *     switch (name) {
         *
         *     case variableName:
         *                  break;
         *     case variableNotName:
         *                  break;
         *                  :
         *                  :
         *                  :
         *                  default: asof,aklfsdaf
         *     }
         */

            int number = 8;
            String month = "";
            switch (number) {   //where I put my variable;

                case 1: month = "Jan";
                break;

                case 2: month = "Feb";
                break;

                case 3: month = "march";
                break;

                case 4: month = "April";
                break;

                case 5: month = "May";
                break;

                case 6: month = "June";
                break;

                case 7: month = "July";
                break;

                case 8: month = "August";
                break;

                case 9: month = "September";
                break;

                case 10: month = "October";
                break;

                case 11: month = "November";
                break;

                case 12: month = "December";
                break;

                default: month = "Invalid Month";

            }
        System.out.println("month = " + month);


    }
}
