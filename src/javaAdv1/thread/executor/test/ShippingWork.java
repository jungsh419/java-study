package javaAdv1.thread.executor.test;

import java.util.concurrent.Callable;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ShippingWork implements Callable<Boolean> {
    private final String orderNo;

    public ShippingWork(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public Boolean call() throws Exception {
        log("배송 시스템 알림: " + orderNo);
        sleep(1000);
        return true;
    }
}
