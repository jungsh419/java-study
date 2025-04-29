package javaMid2.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {
    public static void main(String[] args) {

        Map<String, Integer> stuMap = new HashMap<>();

        stuMap.put("stuA",90);
        System.out.println("stuMap = " + stuMap);

        stuMap.put("stuA",100); //-> 같은 키의 값을 변경하면 기존 값이 변경됨
        System.out.println("stuMap = " + stuMap);

        boolean containsKey = stuMap.containsKey("stuA");
        System.out.println("containsKey = " + containsKey);

        //특정 학생의 값 삭제
        stuMap.remove("stuA");
        System.out.println("stuMap = " + stuMap);

    }
}
