package ua.tef.BLOCK01.trainingcod.tef01;

/**
 * Created by User on 17.03.2016.
 */
public class View {

    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_INT = "INT value = ";

    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + value);
    }
}
