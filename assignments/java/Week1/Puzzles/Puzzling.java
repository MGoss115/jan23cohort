package assignments.java.Week1.Puzzles;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Puzzling {

    public int[] getTenRolls() {
        Random rand = new Random();
        int[] newList = new int[10];
        for (int i = 0; i < 10; i++) {
            newList[i] = (rand.nextInt(1, 11));
        }
        return newList;
    }

    public String getRandomLetter() {
        String[] alphaLetters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String oneLetter = "' '";
        Random randLetter = new Random();

        for (int i = 0; i <= 1; i++) {
            i = randLetter.nextInt(0, 26);
            oneLetter = alphaLetters[i];
        }
        return oneLetter;
    }

    public String generatePassword() {

        int count = 1;
        String newPassword = " ";

        while (count <= 8) {
            newPassword += getRandomLetter();
            count++;
        }
        return newPassword;
    }

    public String[] getNewPasswordSet(int num) {
        String[] passwordSet = new String[num];

        for (int i = 0; i < num; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }
}
