package javaAdv1.thread.control;

import javaAdv1.thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {

        //메인 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread= "+ mainThread);
        log("mainThread.ThreadId()= "+ mainThread.threadId());
        log("mainThread.getName()= "+ mainThread.getName());
        log("mainThread.getPrioriy()= "+ mainThread.getPriority());
        log("mainThread.getThreadGroup()= "+ mainThread.getThreadGroup());
        log("mainThread.getState()= "+ mainThread.getState());
        System.out.println();

        //myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread= "+ myThread);
        log("myThread.ThreadId()= "+ myThread.threadId());
        log("myThread.getName()= "+ myThread.getName());
        log("myThread.getPrioriy()= "+ myThread.getPriority());
        log("myThread.getThreadGroup()= "+ myThread.getThreadGroup());
        log("myThread.getState()= "+ myThread.getState());

    }
}
