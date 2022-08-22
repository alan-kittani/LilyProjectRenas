package Calculator;

public class Calculator {

    static int id = 0;
    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int result = 0;
    String type = null;
    // it will execute first and only 1 time
    static {
        System.out.println("------------");
        System.out.println("Calculator is created");
        System.out.println("------------");
    }

    //Overloading, the constructor executes everytime
    public Calculator (int number1, int number2) {

        System.out.println("------------");
        System.out.println("Calculator is created");
        System.out.println("------------");
        id++;
        this.number1 = number1;
        this.number2 = number2;


    }

    //Overloading, the constructor executes everytime
    public Calculator(int number1, int number2, int number3){
        System.out.println("------------");
        System.out.println("Calculator is created");
        System.out.println("------------");
        id++;
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;

    }

    public void execute (String type){
        this.type = type;
        switch (type){
            case "+":
                getSum();
                break;
            case "-":
                getDiff();
                break;
            case "/":
                getDivide();
                break;
            case "*":
                getMultiply();
                break;
            default:
        }
    }

    private void getSum () {
        if (number3 == 0) {
            result = number1 + number2;
        }
        else{
            result = number1 + number2 + number3;
        }

    }

    private void getDiff () {
        if (number3 == 0) {
            result = number1 - number2;
        }
        else{
            result = number1 - number2 - number3;
        }
    }

    private void getDivide (){
        if (number3 == 0) {
            result = number1 / number2;
        }
        else {
            result = number1 / number2 / number3;
        }
    }

    private void getMultiply (){
        if (number3 == 0) {
            result = number1 * number2;
        }
        else {
            result = number1 * number2 * number3;
        }
    }
// We can't overload toString method because there is no parameter
    public String toString()
    {

        if(number3 != 0)
        {
            return number1 + " " + type + " " +number2 + " " + type + " " +number3 + " = " +result;
        }
        else
        {
            return number1 + "  " + type + " " +number2 + " " + " = " +result;
        }
    }
}
