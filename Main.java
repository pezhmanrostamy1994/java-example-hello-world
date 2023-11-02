
import View.GreetingView;
import Controller.GreetingController;

public class Main {
    public static void main(String[] args) {
        GreetingView view = new GreetingView();
        GreetingController controller = new GreetingController(view);
        controller.getUserInputAndDisplayGreeting();
    }
}
