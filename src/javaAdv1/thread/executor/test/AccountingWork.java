package javaAdv1.thread.executor.test;

import java.util.concurrent.Callable;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class AccountingWork implements Callable<Boolean> {
    private final  String orderNo;

    public AccountingWork(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public Boolean call() throws Exception {
        log("회계 시스템 업데이트: " + orderNo);
        sleep(1000);
        return true;
    }
}
