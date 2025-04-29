package javaMid2.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {

        Map<String, Integer> stuMap = new HashMap<>();

        stuMap.put("stuA",50);
        System.out.println("stuMap = " + stuMap);

        //학생이 없는 경우에만 추가1
        if(!stuMap.containsKey("stuA"))
        {
            stuMap.put("stuA", 100);

        }
        System.out.println("stuMap = " + stuMap);

        //학생이 없는 경우에만 추가2
        stuMap.putIfAbsent("stuA",100); // 이미 존재해서 안들어감
        stuMap.putIfAbsent("stuB",100); // 들어감
        System.out.println("stuMap = " + stuMap); //stuA, stuB 출력
    }
}
