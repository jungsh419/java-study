package javaMid1.exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {

        NetworkServiceV0 nS = new NetworkServiceV0();

        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.printf("전송할 문자 : ");
            String input = scan.nextLine();
            if(input.equals("exit"))
            {
                break;
            }
            nS.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
