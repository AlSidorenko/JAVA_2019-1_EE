package ua.tef.BLOCK01.task01_002;

/**
 * Created on 27.08.2019.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Model {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Model{" +
                "text='" + text + '\'' +
                '}';
    }
}
