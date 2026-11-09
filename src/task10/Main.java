package task10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of(
                "java", "python", "java",
                "go", "python", "java"
        );
        Map<String, Integer> map = take(words);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.toString());
        }

    }
    static Map<String, Integer> take(List<String> words){
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            if(!map.containsKey(word)){
                map.put(word, 1);
            }
            map.put(word, map.get(word) + 1);
        }
        return map;
    }
}
