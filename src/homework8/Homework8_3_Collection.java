package homework8;

import java.util.HashMap;
import java.util.Map;

public class Homework8_3_Collection {
    public static Map<String, Boolean>  wordMultiple(String[] words) {
        Map<String, Boolean> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, true);
            } else {
                map.put(word, false);
            }
        }
        return map;
    }
}