package javaAdv1.thread.executor.test;

import java.util.concurrent.Callable;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class InventoryWork implements Callable<Boolean> {
    private final String orderNo;

    public InventoryWork(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public Boolean call() throws Exception {
        log("재고 업데이트: " + orderNo);
        sleep(1000);
        return true;
    }
}
