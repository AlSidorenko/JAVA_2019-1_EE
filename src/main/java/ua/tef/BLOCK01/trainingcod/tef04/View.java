package ua.tef.BLOCK01.trainingcod.tef04;

/**
 * Created on 11.10.2019 0:37.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class View {

    public static final String INPUT_INT_DATA = "Please, enter INT = ";
    public static final String WRONG_DATA = "Wrong! Please, enter again INT = ";
    public static final String RESULT = "Result = ";

    public void printMessage(String text) {
        System.out.print(text);
    }

    public void printMessageAddInt(String text, int numb) {
        System.out.println(text + numb);
    }
}
