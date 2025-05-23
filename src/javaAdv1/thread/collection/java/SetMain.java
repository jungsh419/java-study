package javaAdv1.thread.collection.java;

import javax.swing.text.html.CSS;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {

        Set<Integer> copySet = new CopyOnWriteArraySet<>();
        copySet.add(1);
        copySet.add(2);
        copySet.add(3);
        System.out.println("copySet = " + copySet);

        ConcurrentSkipListSet<Object> skipSet = new ConcurrentSkipListSet<>(); // 정렬
        skipSet.add(3);
        skipSet.add(1);
        skipSet.add(2);
        System.out.println("skipSet = " + skipSet);

    }
}
