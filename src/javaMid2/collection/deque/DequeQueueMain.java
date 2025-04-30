package javaMid2.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        //데이터 추가
        deque.offer(1);
        System.out.println("deque = " + deque);
        deque.offer(2);
        System.out.println("deque = " + deque);
        deque.offer(3);
        System.out.println("deque = " + deque);

        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque = " + deque);

    }
}
