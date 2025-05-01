package javaMid2.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {

        // 불변 리스트 생성
        List<Integer> list = List.of(1,2,3);

        // 가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>();
        mutableList.add(4);
        System.out.println("list = " + list);
        System.out.println("mutableList = " + mutableList);

        // 가변 -> 불변
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        //UnsupportedOperationException 에러 발생
        // unmodifiableList.add(3);
        System.out.println("unmodifiableList = " + unmodifiableList);

    }
}
