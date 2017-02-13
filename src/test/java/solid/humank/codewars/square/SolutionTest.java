import org.junit.Test;
import solid.humank.codewars.square.Kata;


import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by kim on 2017/2/13.
 */
public class SolutionTest {

    //CodeWars 官方測試程式, 但我希望能以pure TDD 模式逐步撰寫
    @Test
    public void basicTests() {
        int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
        int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));

        input = new int[] { 100, 101, 5, 5, 1, 1 };
        expected = new int[] { 10, 10201, 25, 25, 1, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));

        input = new int[] { 1, 2, 3, 4, 5, 6 };
        expected = new int[] { 1, 4, 9, 2, 25, 36 };
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.squareOrSquareRoot(input)));
    }
}
