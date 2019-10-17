package ua.tef.BLOCK02.trainingcod.Sorter.BubbleSort_del;

import java.util.Arrays;

/**
 * Created on 10.10.2019 17:36.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class BubbleSortStart {

    public static void main(String[] args) {

        long timeStart = System.currentTimeMillis();
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {-25, 87, 124, 5, 33, 53, 3};
        System.out.printf("Array is not sorting: %s\n", Arrays.toString(array));
        bubbleSort.sort(array);
        System.out.printf("Array is sorting: %s\n", Arrays.toString(array));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("Time: %s ms.", timeFinish - timeStart);
    }
}
