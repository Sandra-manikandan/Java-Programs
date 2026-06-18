package JDBC;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    WordFrequency(String str){
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = str.split(" ");
        for(String word : words)
        {
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, ++count);
            } else {
                map.put(word, 1);
            }

        }
        System.out.println("Word Frequencies:");

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
