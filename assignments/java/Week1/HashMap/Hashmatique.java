package assignments.java.Week1.HashMap;

import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Slow Jam", "Lorem ipsum dolor sit amet");
        trackList.put("Fast Jam", "Lorem ipsum dolor sit amet");
        trackList.put("Medium Jam", "Lorem ipsum dolor sit amet");
        trackList.put("High", "Lorem ipsum dolor sit amet");

        String oneSong = trackList.get("Slow Jam");
        System.out.println(oneSong);

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println("Title: " + key + " " + "Lyrics: " + trackList.get(key));
        }
    }
}
