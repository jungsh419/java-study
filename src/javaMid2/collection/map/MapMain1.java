package javaMid2.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("stu1", 90);
        studentMap.put("stu2", 80);
        studentMap.put("stu3", 70);
        studentMap.put("stu4", 60);
        studentMap.put("stu5", 50);

        System.out.println("studentMap = " + studentMap);
        // 특정학생 조회
        Integer res = studentMap.get("stu1");
        System.out.println("res = " + res);

        //ketSet활용
        System.out.println("keySet 활용");
        Set<String> ketSet = studentMap.keySet(); //모든키를 Set구조로 반환
        for (String key : ketSet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key+", value = " + value);
        }

        System.out.println("entrySet 활용" );
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);

        }

        System.out.println("values활용");
        Collection<Integer> value = studentMap.values(); //모든 값을 Collection으로 반환
        for (Integer i : value) {
            System.out.println("i = " + i);
        }
    }
}
