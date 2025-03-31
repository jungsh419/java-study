package javastart.method;

public class MethodEx3 {
    public static void main(String[] args)
    {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 12000);

        System.out.println("최종 잔액 : "+balance+"원");
    }
    public static int deposit(int b, int a)// 입금
    {

        int res = b + a;
        System.out.println(a + "원을 입금하였습니다. 현재 잔액: " + res+"원");
        return res;
    }
    public static int withdraw(int b, int a)// 출금
    {
        if(b<a){
            System.out.println("계좌의 잔액이 부족합니다.");
            return b;
        }
        int res = b - a;
        System.out.println(a + "원을 출금하였습니다. 현재 잔액: " + res+"원");

        return res;

    }

}



