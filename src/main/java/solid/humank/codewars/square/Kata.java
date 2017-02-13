package solid.humank.codewars.square;

import java.util.Arrays;

/**
 * Created by kim on 2017/2/13.
 */
public class Kata {
    public static double[] squareOrSquareRoot(double[] input) {

        int size = input.length;
        double[] sutArray = new double[size];

        for (double item:input) {
            Math.sqrt(item);
        }

        return sutArray;
    }
}
