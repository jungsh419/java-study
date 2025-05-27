package javaAdv1.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static javaAdv1.thread.executor.ExcutorUtils.*;
import static util.ThreadUtils.sleep;

public class preStartPoolMain {
    public static void main(String[] args) {

        ExecutorService es = Executors.newFixedThreadPool(1000);
        printState(es);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) es;
        poolExecutor.prestartAllCoreThreads();
        sleep(100);
        printState(es);
    }
}
