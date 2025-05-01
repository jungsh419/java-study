package javaMid2.collection.utils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {

        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); //자바 5
        List<Integer> list4 = List.of(); // 자바 9

        System.out.println("list3.getClass = " + list3.getClass());
        System.out.println("list4.getClass = " + list4.getClass());


        List<Integer> list5 = Arrays.asList(1,2,3);
        List<Integer> list6 = List.of(1,2,3);

        // Arrays.asList : 기존 배열의 참조값을 그대로 사용
        // List.of:  기존 배열의 요소들로 새로운 불변 리스트를 만듬
        Integer[] arr = {1,2,3,4,5}; //x001
        List<Integer> arrList =  Arrays.asList(arr);//x001
        arrList.set(0,100);

        List<Integer> list8 = List.of(arr);
        //UnsupportedOperationException
        // list8.set(0,100);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);

    }
}
