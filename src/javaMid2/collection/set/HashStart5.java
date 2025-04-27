package javaMid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

// 검색 속도는 빠르지만 낭비되는 메모리가 너무 크다.
public class HashStart5 {
    static final int CAPACITY = 10;
    public static void main(String[] args) {
        //입력: 1, 2, 5, 8, 14, 99, 9
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        System.out.println("bucket = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++)
        {
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));

        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("contains = (" + searchValue+") "+ contains);

    }
    private static boolean contains(LinkedList<Integer>[] buckets, int value)
    {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(value);

    }

    private static void add(LinkedList<Integer>[] buckets, int value)
    {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        if(!bucket.contains(value))
        {
            bucket.add(value);
        }
    }


    static int hashIndex(int value)
    {
        return value%CAPACITY;
    }



}
