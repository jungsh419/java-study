package javaAdv1.thread.executor.future;

import util.ThreadUtils;

import java.util.Random;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        thread.join();
        int res = myRunnable.value;
        log("result Value = "+res);
    }
    static class MyRunnable implements Runnable{
        int value;
        @Override
        public void run() {
            log("Runnable 시작");
            sleep(2000);
            value = new Random().nextInt(10);
            System.out.println("create value = " + value);
            log("Runnable 종료");


        }
    }
}
