package javaMid2.collection.map.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrinterQueueTest {
    public static void main(String[] args) {

        Deque<String> printQueue = new ArrayDeque<>();
        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");
        System.out.println("출력: " + printQueue.poll() );
        System.out.println("출력: " + printQueue.poll());
        System.out.println("출력: " + printQueue.poll());
    }
}
