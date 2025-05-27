package javaAdv1.thread.executor.poolsize;

import javaAdv1.thread.executor.ExcutorUtils;
import javaAdv1.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static javaAdv1.thread.executor.ExcutorUtils.*;
import static util.MyLogger.log;

public class PoolSizeMainV4 {

    //static final int TASK_SIZE = 1100; // 일반
    static final int TASK_SIZE = 1200; // 긴급
    //static final int TASK_SIZE = 1201; // 거절
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        printState(es);

        long startMs = System.currentTimeMillis();


        for (int i = 1; i <= TASK_SIZE; i++) {
            String name = "task"+i;
            try
            {
                es.execute(new RunnableTask(name));
                printState(es,name);

            }catch (RejectedExecutionException e)
            {
                log(name + " -> " + e);

            }
        }
        es.close();
        long endMs = System.currentTimeMillis();
        log("time: " + (endMs - startMs));

    }
}
