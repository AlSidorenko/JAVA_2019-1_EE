package ua.tef.BLOCK01.trainingcod.tef04;

/**
 * Created on 11.10.2019 0:37.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Model {

    private int numb;

    public int addIntOurValue(int value) {
        numb += value;
        return numb;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }
}
