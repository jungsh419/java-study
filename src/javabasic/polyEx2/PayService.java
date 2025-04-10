package javabasic.polyEx2;

public class PayService {
    public void processPay(Pay pay, int amount) {
        boolean result;

        if (pay instanceof KakaoPay)
        {
            Pay kakaoPay = new KakaoPay();
            System.out.println("결제를 시작합니다: option=" + ((KakaoPay)kakaoPay).getOption() + ", amount=" + amount);
            result = kakaoPay.pay(amount);
        }

        else if (pay instanceof NaverPay)
        {
            Pay naverPay = new NaverPay();
            System.out.println("결제를 시작합니다: option=" + ((NaverPay)naverPay).getOption() + ", amount=" + amount);
            result = naverPay.pay(amount);
        }
        else
        {
            Pay defaultPay = new DefaultPay();
            result = defaultPay.pay(amount);

        }
        if (result)
        {
            System.out.println("결제가 성공했습니다.");
        }
        else
        {
         System.out.println("결제가 실패했습니다.");
        }
    }
}
