package javaAdv1.thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

//즉각적으로 thread를 빠져나옴 
public class ThreadStopMainV3 {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask, "work");
        thread.start();
        sleep(100);
        log("작업 중단 지시 javaAdv1.thread.control.interrupt");
        thread.interrupt();
        log("work 스레드 인터럽트 상태 1 = "+ thread.isInterrupted());


    }
    static class MyTask implements Runnable{
        @Override
        public void run() {

            while (!Thread.currentThread().isInterrupted()) {
                log("작업 중");
            }

            log("work 스레드 인터럽트 상태2 = "+ Thread.currentThread().isInterrupted());
            log("자원 정리");
            log("자원 종료");
        }
    }
}
