package Day_17_ArraysAgain;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class ArraysReverseInPlace {

    public static void main(String[] args) {
        
        
        int [] arrayOne = {3, 4, 5 , 6, 7, 8, 9, 0, -12}; //  9/2 = 4.5 ==> 4

        // goal {-12, 0, 9, 8, 7, 5, 4, 3}


        for (int i = 0; i < arrayOne.length/2; i++) {

            int temp = arrayOne[1];  // {3, 4, 5 , 6, 7, 8, 9, 0, -12}
            arrayOne[i] = arrayOne[arrayOne.length-i-1]; //
            arrayOne[arrayOne.length-i-1] = temp;
            
        }

        System.out.println(Arrays.toString(arrayOne));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
