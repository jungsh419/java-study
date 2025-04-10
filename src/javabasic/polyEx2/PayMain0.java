package javabasic.polyEx2;

public class PayMain0 {
    public static void main(String[] args) {

        PayService payService = new PayService();
        Pay pay1 = new KakaoPay();
        payService.processPay(pay1,10000);

        Pay pay2 = new NaverPay();
        payService.processPay(pay2,15000);

        Pay pay3 = new DefaultPay();
        payService.processPay(pay3,15000);


    }
}
