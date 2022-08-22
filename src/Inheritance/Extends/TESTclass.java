package Inheritance.Extends;
import Inheritance.Extends.Animal;
import Inheritance.Extends.Dog;
import Inheritance.Extends.Fish;
import MyUtil.TestClassForPublic;

public class TESTclass {


    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.name = "tiger";
        animal1.age = 20;
        animal1.color = "Orange and Black";
        animal1.Gender = "Male";
        animal1.limbs = 4;

        System.out.println(animal1);
        animal1.eat();
        animal1.Grow();

        TestClassForPublic.breakLines();

        Dog dog1 = new Dog();
        dog1.name = "Ace";
        dog1.age = 1.5;
        dog1.color = "white";
        dog1.Gender = "male";
        dog1.limbs = 4;
        dog1.toothCount = 14;
        dog1.eat();
        dog1.Grow();
        System.out.println(dog1);
        dog1.shed();
        dog1.walk();
        dog1.printTeeth();

        TestClassForPublic.breakLines();

        Fish fs = new Fish();

        fs.name = "fishie";
        fs.age = 1.2;
        fs.color = "orange";
        fs.Gender = "female";
        fs.limbs = 0;
        fs.finCount = 2;
        fs.eat();
        fs.Grow();
        fs.swim();
        System.out.println(fs);





















    }
}
