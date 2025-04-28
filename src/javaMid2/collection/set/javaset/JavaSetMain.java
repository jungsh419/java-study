package javaMid2.collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        run(hashSet);
        run(linkedSet);
        run(treeSet);
    }

    private static void run(Set<String> set)
    {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        Iterator<String> stringIterator = set.iterator();
        while(stringIterator.hasNext())
        {
            System.out.print(stringIterator.next()+" ");
        }
        System.out.println();
        System.out.println("set = " + set);
    }
}
