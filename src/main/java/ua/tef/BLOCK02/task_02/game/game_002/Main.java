package ua.tef.BLOCK02.task_02.game.game_002;

public class Main {

    public static void main(String[] args) {
	    // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
        // Run
        controller.processUser();
    }
}
