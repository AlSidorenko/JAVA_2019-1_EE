package ua.tef.BLOCK02.trainingcod.Sorter.BubbleSort_TwoDimensional;

/**
 * Created on 10.10.2019 0:19.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class BubbleSorter {

    public static void sort(int[] data) {
        for (int barrier = data.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
    }
}
