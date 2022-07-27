package Day_8_Scanners;

import java.util.Scanner;

public class Day_8_Hard_Homework {

    public static void main(String[] args) {
        /**
         * Challenge Question:
         * Write a program Where user is being ask to select items from the list you presented for instance:
         * Select 1 for Shirt
         * Select 2 for pants
         * select 3 for dress
         * select 4 for hat
         * select 5 for shoes
         * User will select one item each time and until users has 3 items.
         * shirt price is = 40
         * pants price is = 60
         * dress price is = 100
         * hat price is = 10
         * shoes price is = 120
         * if user total amount is more than 200, user will receive 20% off on the total price
         * if user total amount is more than 150, user will receive 15% off on the total  price
         * if user total amount is more than 100, user will receive 5% off on the total price
         * your job is to Use the topics we learnt and calculate the Users Total amount after User select 3 items and print it.
         */

        Scanner input = new Scanner(System.in);

        double shirt = 40;
        double pants = 60;
        double dress = 100;
        double hat = 10;
        double shoes = 120;

        System.out.println("Hello, please select your clothing");
        System.out.println("You may only select 1 item each, and may only take a total of 3 items.");
        System.out.println("Press 1 for a shirt \nPress 2 for pants \nPress 3 for a dress \nPress 4 for a hat \nPress 5 for shoes ");

        double clothes = input.nextDouble();

        if (clothes == 1) {
            clothes = shirt;
            System.out.println("Shirt added to cart");
        }
        else if (clothes == 2) {
            clothes = pants;
            System.out.println("Pants added to cart");
        }
        else if (clothes == 3) {
            clothes = dress;
            System.out.println("Dress added to cart");
        }
        else if (clothes == 4) {
            clothes = hat;
            System.out.println("Hat added to cart");
        }
        else if (clothes == 5) {
            clothes = shoes;
            System.out.println("Shoes added to cart");
        }
        else {
            System.out.println("Invalid Item");
        }

        System.out.println("*********************************");

        System.out.println("Please select your second item");

        double clothesTwo = input.nextDouble();

        if (clothesTwo == 1 && clothes != shirt) {
            clothesTwo = shirt;
            System.out.println("Shirt added to cart");
        }
        else if (clothesTwo == 2 && clothesTwo != pants) {
            clothesTwo = pants;
            System.out.println("Pants added to cart");
        }
        else if (clothesTwo == 3 && clothes != dress) {
            clothesTwo = dress;
            System.out.println("Dress added to cart");
        }
        else if (clothesTwo== 4 && clothes != hat) {
            clothesTwo = hat;
            System.out.println("Hat added to cart");
        }
        else if (clothesTwo == 5 && clothes != shoes) {
            clothesTwo = shoes;
            System.out.println("Shoes added to cart");
        }
        else {
            System.out.println("Invalid Order");
        }

        System.out.println("*********************************");

        System.out.println("Please select your third item");

        double clothesThree = input.nextDouble();
        {

            if (clothesThree == 1 && clothesTwo != shirt && clothes != shirt) {
                clothesThree = shirt;
                System.out.println("Shirt added to cart");
            } else if (clothesThree == 2 && clothesTwo != pants && clothes != pants) {
                clothesThree = pants;
                System.out.println("Pants added to cart");
            } else if (clothesThree == 3 && clothesTwo != dress && clothes != dress) {
                clothesThree = dress;
                System.out.println("Dress added to cart");
            } else if (clothesThree == 4 && clothesTwo != hat && clothes != hat) {
                clothesThree = hat;
                System.out.println("Hat added to cart");
            } else if (clothesThree == 5 && clothesTwo != shoes && clothes != shoes) {
                clothesThree = shoes;
                System.out.println("Shoes added to cart");
            } else {
                System.out.println("Invalid Order");
            }
        }

        double totalOne = clothes + clothesTwo + clothesThree;
        String discountString = "";
        double discountNumber;

        if (totalOne > 200) {
            discountString = "20%";
            discountNumber = totalOne * 0.20;
            double totalTwo = totalOne - discountNumber;

            System.out.println("Discount = " +discountString);
            System.out.println("Total = " + totalTwo);
        }
        else if (totalOne > 150 && totalOne <= 200) {
            discountString = "15%";
            discountNumber = totalOne * 0.15;
            double totalTwo = totalOne - discountNumber;

            System.out.println("Discount = " +discountString);
            System.out.println("Total = " + totalTwo);
        }
        else if (totalOne > 100 && totalOne <= 150) {
            discountString = "5%";
            discountNumber = totalOne * 0.5;
            double totalTwo = totalOne - discountNumber;

            System.out.println("Discount = " +discountString);
            System.out.println("Total = " + totalTwo);
        }
        else {
            System.out.println("No discount provided");
        }








    }
}
