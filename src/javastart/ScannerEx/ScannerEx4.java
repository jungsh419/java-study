package javastart.ScannerEx;
import java.util.Scanner;
public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("구구단의 단 수를 입력해주세요 : ");
        int num = scan.nextInt();

        for(int i=1;i<=9;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }


    }
}
