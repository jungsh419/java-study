package javaMid1.nested.nested.annoymous.ex;

import javaMid1.lang.clazz.Hello;

import java.util.Random;

public class ExRefMainV3 {
    public static void hello(Process process)
    {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        Process Dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };



        hello(Dice);
        hello(new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++)
                {
                    System.out.println("i = " + i);
                }
            }

        });
    }

}
