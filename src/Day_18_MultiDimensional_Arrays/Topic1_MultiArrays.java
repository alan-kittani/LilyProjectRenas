package Day_18_MultiDimensional_Arrays;

public class Topic1_MultiArrays {

    public static void main(String[] args) {

        // Arrays having arrays as values or having multiple arrays nested inside each other

        // Datatype [] name = {......}
        // DataType [][] name = {{.........}, {.........}}

        int [] normalArray = {1, 2, 3, 4};

        int a = normalArray[3];


        int [][] multiArray = { {12, 32 , 23, 45}, {53, 24, 58, 76} };

        // Index to choose which array to select      0                   1
        // for inside array      0, 1, 2, 3         0,  1,   2,   3


        System.out.println(multiArray[0][3]);

        int [][][] tripleArray = { {{1, 2, 3, 4}, {-1, -2, -3 , -4}},     {{5, 6, 7, 8}, {-1, -2, -3 ,-4}},      {{9, 10, 11, 12}, {-9, -10, -11, -12} } };

        // the first array :                      0                                   1                                   2

        // second array  :              0,            1                          0,           1                       0,                    1

        // third array :          0, 1, 2, 3          0, 1 , 2, 3             0, 1 ,2 ,3       0, 1, 2, 3            0, 1, 2, 3         0, 1, 2, 3


        System.out.println(tripleArray[0][0][3]);

































    }
}
