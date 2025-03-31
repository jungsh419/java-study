package javastart.ScannerEx;
import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("숫자를 입력하시오 :");
        int num = scan.nextInt();

        if(num%2==0)
        {
            System.out.println("당신이 입력한 숫자 :"+num+" 짝수입니다.");
        }
        else
        {
            System.out.println("당신이 입력한 숫자 :"+num+" 홀수입니다.");
        }
    }
}
