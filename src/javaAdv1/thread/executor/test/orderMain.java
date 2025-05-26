package javaAdv1.thread.executor.test;

import java.util.concurrent.ExecutionException;

public class orderMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        NewOrderService newOrderService = new NewOrderService();
        newOrderService.order("test");
    }
}
