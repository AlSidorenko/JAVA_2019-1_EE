package ua.tef.BLOCK01.trainingcod.tef01;

/**
 * Created by User on 17.03.2016.
 */
public class Model {

    private int value;

    public int addIntOurValue(int valueInt) {
        value += valueInt;
        return value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
