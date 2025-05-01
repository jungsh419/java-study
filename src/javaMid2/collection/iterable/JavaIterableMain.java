package javaMid2.collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator1 = list.iterator();
//        while(iterator1.hasNext())
//        {
//            System.out.println(iterator1.next());
//        }
        foreach(list);
        printAll(iterator1);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator<Integer> iterator2 = set.iterator();
//        while(iterator2.hasNext())
//        {
//            System.out.println(iterator2.next());
//        }
        foreach(set);
        printAll(iterator2);


    }

//    private static void foreach(Set<Integer> set) {
//        for (Integer i : set) {
//            System.out.println("i = " + i);
//        }
//    }
//
//    private static void foreach(List<Integer> list) {
//        for (Integer integer : list) {
//            System.out.println("integer = " + integer);
//        }
//    }

    private static void foreach(Iterable<Integer> list) {

        for (Integer integer : list) {
            System.out.println("integer = " + integer);
        }
    }

    private static void printAll(Iterator<Integer> iter)
    {
        System.out.println("iterator = "+iter.getClass());
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }

}
