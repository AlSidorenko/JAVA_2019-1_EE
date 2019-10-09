package ua.tef.BLOCK02.trainingcod.PracticalUseMVC_20170821;

public class Main {

    public static void main(String[] args) {
	    // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();

    }


}
