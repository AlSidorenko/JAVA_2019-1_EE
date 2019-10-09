package ua.tef.BLOCK02.trainingcod;

/**
 * Created on 09.10.2019 23:51.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class App_001 {

    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
