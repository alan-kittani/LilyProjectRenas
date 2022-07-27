package Day_13_WhileLoop;

public class Topic2_whileLoop {

    public static void main(String[] args) {


        int i = 0;
        while (i < 10){
            // i++;  This will increase the i value before printing the code below
            System.out.println("The i values: " +i);
            i++;   // it is important to know where to put the increment code, the placement matters

        }

        System.out.println("----------------------------------");

        int j = 0;
        while (j <= 10){
            if (j == 8) {
                j = j + 2;   // we have to put this here so j value does not get stuck at 8
                continue;
            }
            System.out.println("The even numbers " +j);
            j = j + 2;
        }
        int k = 0;
        while (k<=10) {
         //   System.out.println("The k Value: " +k);  if we put this here, the 9 will be included in the print because the break code is below this
            if (k==9){
                break;
            }
            System.out.println("The k Value: " +k); // 0, 1, 2, 3, 4, 5, 6, 7, 8.
             k++; // k = k + 1
        }






















    }
}
