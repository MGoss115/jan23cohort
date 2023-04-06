package assignments.java.Week1.CafeJavaAssignment;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCofee = 2.75;
        double latte = 3.75;
        double cappuccino = 3.9;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1);
        // ** Your customer interaction print statements will go here ** //
        // System.out.println(customer1 + pendingMessage);

        // ***** Noah Order *******//
        // if (isReadyOrder4) {
        // System.out.println(customer4 + readyMessage + displayTotalMessage +
        // cappuccino);
        // } else {
        // System.out.println(customer4 + pendingMessage);
        // }

        // ***** Sam Order ****** //
        // System.out.println(customer2 + ", " + displayTotalMessage + (latte * 2));
        // if (isReadyOrder2) {
        // System.out.println(customer2 + readyMessage + " " + displayTotalMessage +
        // (latte * 2));
        // } else {
        // System.out.println(customer2 + pendingMessage);
        // }

        // ****** Jimmy Order ****** //
        System.out.println(customer3 + " " + displayTotalMessage + (double) (latte - dripCofee));
    }
}
