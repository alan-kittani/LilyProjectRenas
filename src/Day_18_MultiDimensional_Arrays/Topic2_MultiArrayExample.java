package Day_18_MultiDimensional_Arrays;

import java.util.Arrays;

public class Topic2_MultiArrayExample {

    public static void main(String[] args) {

        String [][] ArrayNames = {{"Alan", "Saman"}, {"Leezan", "Seepan"}};


        System.out.println("My oldest siblings name is: " +ArrayNames[1][1]);


        int [] one = new int[3];
                 // {0, 0, 0}

        int  [][] two = new int [2][2];
                //     {{0, 0}, {0,0,}}


        // let's assign each value to be 5;


        // {{5, 5} {5,5}}

        for (int i = 0; i < two.length; i++) {


            for (int j = 0; j < two[0].length; j++) {


                two[i][j] = two[i][j] + 5;    //  {{0, 0}, {0,0,}}





            }

        }

        System.out.println(Arrays.deepToString(two));


























    }
}
