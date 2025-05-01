package javaMid2.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ofmain {
    public static void main(String[] args) {

        //불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        System.out.println(" list.class =  " + list.getClass());
        //UnsupportedOperationException 불변이라 예외 발생
        //list.add(4);
    }
}
