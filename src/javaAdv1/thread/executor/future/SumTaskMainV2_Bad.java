package javaAdv1.thread.executor.future;

import java.util.concurrent.*;

import static util.MyLogger.log;

public class SumTaskMainV2_Bad {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SumTask sumTask1 = new SumTask(1, 50);
        SumTask sumTask2 = new SumTask(51, 100);

        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Integer> future1 = es.submit(sumTask1);
        Integer integer1 = future1.get();
        Future<Integer> future2 = es.submit(sumTask2);
        Integer integer2 = future2.get();

        log("task1.result ="+integer1);
        log("task2.result ="+integer2);

        int sumAll = integer1+integer2;

        System.out.println("sumAll = " + sumAll);

        log("End");

        es.close();



    }
    static class SumTask implements Callable<Integer>
    {
        int startValue;
        int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() throws InterruptedException {
            log("작업 시작");
            Thread.sleep(2000);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum+=i;
            }
            log("작업 완료 result = "+sum);
            return sum;
        }
    }
}

