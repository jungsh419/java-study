package javaAdv1.thread.executor.test;

import java.util.concurrent.ExecutionException;

public class orderMain1 {
    public static void main(String[] args) throws Exception {

        OldOrderService oldOrderService = new OldOrderService();
        oldOrderService.order("test");
    }
}
