package solid.humank.codewars.square;

import java.util.Arrays;

/**
 * Created by kim on 2017/2/13.
 *
 *
 * If the number has an integer square root, take this, otherwise square the number.
 * [4,3,9,7,2,1] -> [2,9,3,49,4,1]
 *
 *
 */
public class Kata {
    public static int[] squareOrSquareRoot(int[] input) {

        int size = input.length;
        int[] sutArray = new int[size];

        for(int i =0; i<input.length;i++){

            if(Math.sqrt((double)input[i]) == (int)Math.sqrt((double)input[i])){
                sutArray[i] = (int)Math.sqrt((double)input[i]);
            }else {
                sutArray[i]=(int)Math.pow(input[i],2);
            }
        }
        return sutArray;
    }
}
