package javabasic.access.ex2;

import javabasic.access.ex.MaxCounter;

public class CounterMain2 {
    public static void main(String[] args) {

        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }
}
