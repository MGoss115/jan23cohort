package assignments.java.Week1.Fundamentals;

import java.util.ArrayList;

public class NameAge {
    public static void main(String[] args) {

        // String name = "Mar'Kebta Goss";
        // int age = 38;
        // String hometown = "Detroit, MI";

        // System.out.println("My name is " + name);
        // System.out.println("I am " + age + " years old");
        // System.out.println("My hometown is " + hometown);

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(i + " " + numList.get(i));
        }

        for (int num : numList) {
            System.out.println(num);
        }
    }
}