package Inheritance.Extends;

public class Animal {

    String name;
    double age;
    String Gender;
    String color;
    int limbs;




    void eat ()
    {
        System.out.println(name + " eats");
    }
    void Grow ()
    {
        System.out.println(name+ " grows");
    }

    public String toString(){
        return "Name: "+name + "\nAge: "+age+ "\ncolor: "+color+ "\ngender: " +Gender+ "\nlimbs: " +limbs;
    }
}

/**
 * black eq = 10
 * bright = 80
 * contrast 50
 * gamma 3
 */