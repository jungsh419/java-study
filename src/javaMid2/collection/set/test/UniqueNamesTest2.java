package javaMid2.collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};

        //배열을 리스트로 변환하기
        List<Integer> list1 = Arrays.asList(inputArr);
        List<Integer> list2 = List.of(inputArr);

        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for(Integer sValue : set)
        {
            System.out.println("sValue = " + sValue);
        }
    }
}
