package javaMid2.collection.set;

import java.util.Arrays;

// 검색 속도는 빠르지만 낭비되는 메모리가 너무 크다.
public class HashStart4 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        //입력: 1, 2, 5, 8, 14, 99

        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray,1);
        add(inputArray,2);
        add(inputArray,5);
        add(inputArray,8);
        add(inputArray,14);
        add(inputArray,99);




        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;

        int hashIndex = hashIndex(searchValue);
        System.out.println("hashIndex = " + hashIndex);
        Integer res = inputArray[hashIndex];
        System.out.println(res);



    }

    static int hashIndex(int value)
    {
       return value%CAPACITY;
    }

    private static void add(Integer[] inputArray, int value)
    {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

}
