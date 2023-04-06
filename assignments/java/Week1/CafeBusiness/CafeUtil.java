package assignments.java.Week1.CafeBusiness;

import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = prices[0];
        for (int i = 1; i <= prices.length; i++) {
            sum += i;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        System.out.println(menuItems);
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        int num = customers.size();
        System.out.println("There are " + num + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}
