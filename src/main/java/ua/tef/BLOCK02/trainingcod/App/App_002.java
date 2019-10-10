package ua.tef.BLOCK02.trainingcod.App;

import java.util.Arrays;

/**
 * Created on 10.10.2019 0:03.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 *
 * Безусловное "всплытие" элемента
 * Самый первый элемент стал самым последним.
 *
 */

public class App_002 {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 0, 8, 9, 7, 6, 2};
        System.out.println(Arrays.toString(array));
        for (int k = 0; k < array.length - 1; k++) {
            swap(array, k, k + 1);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int fst, int snd) {
        int tmp = array[fst];
        array[fst] = array[snd];
        array[snd] = tmp;
    }
}
