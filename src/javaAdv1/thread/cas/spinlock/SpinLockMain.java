package javaAdv1.thread.cas.spinlock;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SpinLockMain {
    public static void main(String[] args) throws InterruptedException {

        //SpinLockBad spinLockBad = new SpinLockBad();
        SpinLock spinLock = new SpinLock();
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Deque<Integer> deque = new ArrayDeque<>();
        Runnable task = new Runnable()
        {
            @Override
            public void run() {
                spinLock.lock();
                try {
                    //critical section
                    log("비즈니스 로직 실행");
                    deque.add(1);
                    log("비즈니스 로직 완료");

                }finally {
                    spinLock.unLock();
                }
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(deque);
    }

}
