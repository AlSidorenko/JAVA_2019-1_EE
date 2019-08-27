package ua.tef.BLOCK01.task01_002;

import java.util.Scanner;

/**
 * Created on 27.08.2019.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Controller implements TextConstants {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setText(inputStrValueWithScanner(sc));
        view.printMessageResult(CORRECT_OPERATION, model.getText());
    }

    public String inputStrValueWithScanner(Scanner sc) {
        String result = null;

        view.printMessage(FIRS_WORD);
        while (!sc.hasNext(HELLO)) {
            view.printMessage(WRONG_OPERATION);
            sc.next();
        }
        result = sc.next() + " ";

        view.printMessage(SECOND_WORD);
        while (!sc.hasNext(WORLD)) {
            view.printMessage(WRONG_OPERATION);
            sc.next();
        }
        result += sc.next();

        return result;
    }
}
