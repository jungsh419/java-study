package javastart.method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance  = 10000;
        while(true)
        {
            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.printf("선택 : ");
            int menu = scan.nextInt();
            //System.out.println();
            switch(menu)
            {
                case 1:
                    System.out.printf("입금액을 입력하세요 : ");
                    int deposit = scan.nextInt();
                    balance = deposit(balance,deposit);
                    break;
                case 2:
                    System.out.printf("출금액을 입력하세요 : ");
                    int withdraw = scan.nextInt();
                    balance = withdraw(balance,withdraw);
                    break;

                case 3:
                    System.out.println("현재 잔액 : "+ balance);
                    break;

                case 4:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
            }

        }
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
