package javaMid1.lang.enumeration;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService2 discountService2 = new DiscountService2();
        int basic = discountService2.discount(ClassGrade.BASIC, price);
        int gold = discountService2.discount(ClassGrade.GOLD, price);
        int diamond = discountService2.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }

}
