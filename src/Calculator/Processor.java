package Calculator;

public class Processor {

    public static void main(String[] args) {

        Calculator calculator1 = new Calculator(5, 6);
        calculator1.execute("*");
        Calculator calculator2 = new Calculator(6, 3, 10);
        calculator2.execute("+");

        // this executes calculator1.toString();
        System.out.println(calculator1);
        System.out.println(calculator2);

    }
}
