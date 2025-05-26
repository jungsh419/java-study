package javaAdv1.thread.executor.test;

import static util.MyLogger.log;

public class OldOrderService {
    public void order(String orderNo) throws Exception {
        InventoryWork inventoryWork = new InventoryWork(orderNo);
        ShippingWork shippingWork = new ShippingWork(orderNo);
        AccountingWork accountingWork = new AccountingWork(orderNo);
        // 작업 요청

        Boolean inventoryResult = inventoryWork.call();
        Boolean shippingResult = shippingWork.call();
        Boolean accountingResult = accountingWork.call();
        // 결과 확인
        if (inventoryResult && shippingResult && accountingResult) {
            log("모든 주문 처리가 성공적으로 완료되었습니다.");
        } else {
            log("일부 작업이 실패했습니다.");
        }
    }
}
