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

        return Arrays.stream(input)
                .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
                .toArray();
    }
}
