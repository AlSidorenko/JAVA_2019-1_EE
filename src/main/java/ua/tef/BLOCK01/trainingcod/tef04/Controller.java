package ua.tef.BLOCK01.trainingcod.tef04;

import java.util.Scanner;

/**
 * Created on 11.10.2019 0:37.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Controller {

    private static final int FIVE = 5;

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setNumb(inputIntValueWithScanner(sc));
        model.addIntOurValue(FIVE);

        view.printMessageAddInt(View.RESULT, model.getNumb());
    }

    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);

        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }
}
