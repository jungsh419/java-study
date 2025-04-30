package javaMid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);
//
//        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
//        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        Map<String, Integer> map3 = new HashMap<>();
//        int sum = 0;
//        for (String s : map1.keySet()) {
//            for (String k : map2.keySet()) {
//
//                if(k == s)
//                {
//                    map3.put(s,(map1.get(s)+map2.get(k)));
//                }
//            }
//        }
        for (String string : map1.keySet()) {
            if(map2.containsKey(string))
            {
                map3.put(string, (map1.get(string) + map2.get(string)));
            }
        }
        System.out.println(map3);



    }
}
