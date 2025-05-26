package javaAdv1.thread.executor.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;

public class NewOrderService {
    private final ExecutorService es = Executors.newFixedThreadPool(10);
    public void order(String orderNo) throws ExecutionException, InterruptedException {
        InventoryWork inventoryWork = new InventoryWork(orderNo);
        ShippingWork shippingWork = new ShippingWork(orderNo);
        AccountingWork accountingWork = new AccountingWork(orderNo);



        try
        {
            Future<Boolean> submit1 = es.submit(inventoryWork);
            Future<Boolean> submit2 = es.submit(shippingWork);
            Future<Boolean> submit3 = es.submit(accountingWork);

            Boolean inventoryWorkres = submit1.get();
            Boolean shippingWorkres = submit2.get();
            Boolean accountingWorkres = submit3.get();

            if(inventoryWorkres && shippingWorkres && accountingWorkres)
            {
                log("모든 주문 처리가 성공적으로 완료되었습니다.");
            }
            else
            {
                log("일부 작업이 실패했습니다.");
            }
        }finally {
            es.close();
        }

    }

}
