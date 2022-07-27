package Day_6_IfElseStatements;

public class Day6_Homework {

    public static void main(String[] args) {

        //task   1:   create   a   java   program   that   will   check   if   number   is   divisible   by   2   and   5   same   time

        int num1 = 32323;

        if (num1 % 2 == 0 && num1 % 5 == 0) {
            System.out.println("This number is divisible by 2 and 5");
        }
        else {
            System.out.println("This number is NOT divisible by 2 and 5");
        }

        System.out.println("*****************************");

        //task   2:   write    java   program   to   find   the   largest   among   three   numbers.   1)   Using   if-else..if

        int number1 = 2324;
        int number2 = 2905;
        int number3 = 2323;

        int max;

        if (number1 > number2) {
            if (number1 > number3) {
                max = number1;
                System.out.println("max = " + max);
            }
        }
        else if (number2 > number1) {
            if (number2 > number3) {
                max = number2;
                System.out.println("max = " + max);
            }
        }
        else if (number3 > number1) {
            if (number3 > number2) {
                max = number3;
                System.out.println("max = " + max);
            }
        }
        else {
            System.out.println("All values are equal");
        }

        System.out.println("*****************************");


        //task   3:   create   Program   to   check   whether   the   given   number   is   positive   or   negative
//      →   If   a   number   is   greater   than   zero   then   it   is   a   positive   number
//              →   If   a   number   is   less   than   zero   then   it   is   a   negative   number
//              →   If   a   number   is   equal   to   zero   then   it   is   neither   negative   nor   positive.

        int number4 = -23;

        int positiveValue;

        int negativeValue;

        int zeroValue;


        if (number4 > 0) {
            positiveValue = number4;
            System.out.println("positive = " + positiveValue);
        }
        else if (number4 < 0) {
            negativeValue = number4;
            System.out.println("negative = " + negativeValue);
        }
        else if (number4 == 0) {
            zeroValue = number4;
            System.out.println("zero = " + zeroValue);
        }



    }
}
