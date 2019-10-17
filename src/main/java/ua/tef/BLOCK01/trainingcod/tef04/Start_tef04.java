package ua.tef.BLOCK01.trainingcod.tef04;

/**
 * Created on 11.10.2019 0:41.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Start_tef04 {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
