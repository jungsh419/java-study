package javabasic.Class3;

public class Account {
    int balance;
    void deposit(int amount){ this.balance += amount;}
    void withdraw(int amount)
    {
        if(amount>this.balance)
        {
        System.out.println("현재 잔액 : "+this.balance +"    "+amount +"원 출금 불가");
        }
        else
        {
            this.balance -= amount;
        }
    }
}
