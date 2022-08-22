package Inheritance.Extends;

import Inheritance.Extends.Animal;

public class Dog extends Animal {

    /**
     *             ^^^^^^^
        public String name;
        public double age;
        public int limbs;

            WHY BOTHER TO CREATE THIS AGAIN WHEN WE MADE IT BEFORE IN THE OTHER CLASS
             this is the importance of inheritance
    */

    int toothCount;

    void shed ()
    {
        System.out.println("Dogs shed");
    }
    void walk ()
    {
        System.out.println("Dogs walk or run");
    }

    void printTeeth()
    {
        System.out.println("Dogs tooth count: " +toothCount);
    }






}
