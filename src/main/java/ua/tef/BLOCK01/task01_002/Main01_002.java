package ua.tef.BLOCK01.task01_002;

/**
 * Created on 27.08.2019.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Main01_002 {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        new Controller(model, view).processUser();
    }
}
