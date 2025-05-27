package javaAdv1.thread.executor.poolsize;

import javaAdv1.thread.executor.ExcutorUtils;
import javaAdv1.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static javaAdv1.thread.executor.ExcutorUtils.*;
import static util.MyLogger.log;

public class poolSizeMainV2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        //위와 동일함
        //ThreadPoolExecutor es = new ThreadPoolExecutor(2, 2, 0L,
        //                                              TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

        log("pool 생성");
        printState(es);

        for (int i = 0; i <= 6; i++) {
            String taskName = "task"+i;
            es.execute(new RunnableTask(taskName));
            printState(es,taskName);
        }
        es.close();
        log("== shutdown 완료");

    }
}
