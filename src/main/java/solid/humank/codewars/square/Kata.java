package solid.humank.codewars.square;

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

            if(isSqrtAble(input[i])){
                sutArray[i] = (int) getSqrt(input[i]);
            }else {
                sutArray[i]= getPow(input, i);
            }
        }
        return sutArray;
    }

    private static boolean isSqrtAble(int i) {
        return getSqrt(i) == (int) getSqrt(i);
    }

    private static int getPow(int[] input, int i) {
        return (int)Math.pow(input[i],2);
    }

    private static double getSqrt(int i) {
        return Math.sqrt((double) i);
    }
}
