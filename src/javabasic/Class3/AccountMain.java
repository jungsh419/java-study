package javabasic.Class3;

public class AccountMain {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(10000);
        acc.withdraw(9000);
        acc.withdraw(2000);
        System.out.println("현재 잔액 : "+ acc.balance);
    }
}
