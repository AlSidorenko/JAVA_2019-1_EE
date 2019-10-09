package ua.tef.BLOCK02.task_02.game.game_001;

public class Main {

    public static void main( String[] args ) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();

    }
}