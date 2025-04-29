package javaMid2.collection.set.myhash;

import java.util.Arrays;

// 검색 속도는 빠르지만 낭비되는 메모리가 너무 크다.
public class HashStart3 {
    public static void main(String[] args) {
        //입력: 1, 2, 5, 8, 14, 99
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;

        Integer res = inputArray[searchValue];
        System.out.println(res);

    }
}
