package ua.tef.BLOCK02.trainingcod.BubbleSort_TwoDimensional;

import java.util.Arrays;

/**
 * Created on 10.10.2019 0:17.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class BubbleSorterTest {

    public static void main(String[] args) {
        int[][] data = {
                { },
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " -> ");
            BubbleSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
