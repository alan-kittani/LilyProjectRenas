package Day_4_Operators;

public class PrePost_Conditions {

    public static void main(String[] args) {

        // post ++

        int num = 10;
        System.out.println(num++); // num = num + 1; the number prints then adds plus one after its printed.
        System.out.println(num);
        num++;
        System.out.println(num);

        // pre ++ and your variable;

        int num1 = 10;
        System.out.println(++num1);

        // num++ this num value will not increase immediately
        // ++num this num value will increase immediately

        // post -- (variable--)
        int num2 = 20;
        System.out.println(num2--);
        System.out.println(num2);

        int num3 = 15;
        System.out.println(--num3);



    }
}
