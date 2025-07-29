package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        Map<String, Integer> result = new HashMap<>();

        for(String word : text.split(" ")) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }

        System.out.println(result);
    }
}
