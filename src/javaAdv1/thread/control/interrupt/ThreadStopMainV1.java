package javaAdv1.thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

// 즉각적으로 스레드를 빠져나오지 못함
public class ThreadStopMainV1 {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask, "work");
        thread.start();
        sleep(4000);
        log("작업 중단 지시 runFlag=false");
        myTask.runFlag = false;

    }
    static class MyTask implements Runnable{

        volatile boolean runFlag = true;

        @Override
        public void run() {

            while(runFlag)
            {
                log("작업 중");
                sleep(3000);
            }
            log("자원 정리");
            log("자원 종료");
        }
    }
}
