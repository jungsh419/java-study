package javaAdv1.thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV1 {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = "+ atomicInteger.get());

        boolean res1 = atomicInteger.compareAndSet(0,1); // 값이 0이면 1로 셋팅 연산 성공 여부 반환
        System.out.println("res1 = "+ res1+", value = "+ atomicInteger.get() );

        boolean res2 = atomicInteger.compareAndSet(0,1); // 값이 0이면 1로 셋팅 연산 성공 여부 반환
        System.out.println("res1 = "+ res2+", value = "+ atomicInteger.get() );



    }
}
