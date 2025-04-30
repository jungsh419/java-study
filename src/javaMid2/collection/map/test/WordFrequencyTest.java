package javaMid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {
    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        String[] texts = text.split(" ");

        for (String s : texts) {
            Integer count = map.get(s);
            if(count == null)
            {
               count = 0;
            }
            count++;

            map.put(s, count);
        }
        System.out.println(map);
    }
}
