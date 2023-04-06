package assignments.java.Week1.Puzzles;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // fizzBuzz();

        Puzzling testApp = new Puzzling();

        // int[] loopThrough = testApp.getTenRolls();
        // for (int i = 0; i < loopThrough.length; i++) {
        // System.out.println(loopThrough[i]);
        // }

        // System.out.println(testApp.getRandomLetter());

        // System.out.println(testApp.generatePassword());

        String[] loopThrough = testApp.getNewPasswordSet(8);
        for (int i = 0; i < loopThrough.length; i++) {
            System.out.println(loopThrough[i]);
        }
    }

    // public static void fizzBuzz() {

    // for (int i = 1; i <= 100; i++) {
    // if (i % 3 == 0 && i % 5 == 0) {
    // System.out.println("FizzBuzz");
    // } else if (i % 3 == 0) {
    // System.out.println("fizz");
    // } else if (i % 5 == 0) {
    // System.out.println("buzz");
    // } else {
    // System.out.println(i);
    // }
    // }
    // }
}
