package javaMid2.collection.map.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleHistoryTest {
    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("faceBook.com");
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
    }
}
