package javaAdv1.thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {

    Mytask mytask = new Mytask();
    Thread t = new Thread(mytask,"work");
    t.start();

    sleep(1000);

    mytask.flag = false;
        log("flag = "+ mytask.flag+", count = "+ mytask.count+" in main");
    }
    static class Mytask implements Runnable
    {
//        boolean flag = true;
//        long count;

        volatile boolean flag =true;
        volatile long count;
        @Override
        public void run() {

            while (flag)
            {
                count++;
                if(count % 100_000_000 == 0)
                {
                    log("flag = "+ flag+", count = "+ count+" in while()");
                }

            }
            log("flag = "+ flag+", count = "+ count+" 종료");
        }
    }
}
