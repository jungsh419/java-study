package if_else;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollar = 0;
        int won;

        if(dollar < 0)
        {
            System.out.println("잘못된 금액");
        } else if (dollar == 0) {
            System.out.println("환전할 돈 X");
        } else if (dollar > 0) {
            won = dollar * 1300;

            System.out.printf("환전시 금액 %d 원",won);
        }
    }


}
