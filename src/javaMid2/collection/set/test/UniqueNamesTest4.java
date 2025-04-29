package javaMid2.collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest4 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> first = new HashSet<>(set1);
        first.addAll(set2);
        System.out.println("first = " + first);

        Set<Integer> second = new HashSet<>(set1);
        second.retainAll(set2);
        System.out.println("second = " + second);

        Set<Integer> third = new HashSet<>(set1);
        third.removeAll(set2);
        System.out.println("third = " + third);




    }
}
