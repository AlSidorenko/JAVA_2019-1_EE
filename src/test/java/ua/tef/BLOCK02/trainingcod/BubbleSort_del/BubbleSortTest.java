package ua.tef.BLOCK02.trainingcod.BubbleSort_del;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 10.10.2019 18:11.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class BubbleSortTest {

    @Test
    public void whenCheckBubbleSortingArray() {
        BubbleSort bubbleSort = new BubbleSort();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        int[] array = {-25, 87, 124, 5, 33, 53, 3};
        bubbleSort.sort(array);
        String result = Arrays.toString(array);
        String expected = "[-25, 3, 5, 33, 53, 87, 124]";

        assertThat(Arrays.toString(array), is(
                String.format("[-25, 3, 5, 33, 53, 87, 124]", System.getProperty("line.separator"))
                ));

        assertThat(result, is(expected));
    }
}
