package javastart.ScannerEx;
import java.util.Scanner;
public class ScannerWhile2 {

    public static void main(String[] args) {

        int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.printf("num1 입력: ");
            num1 = scan.nextInt();
            System.out.printf("num2 입력: ");
            num2 = scan.nextInt();
            if(num1 == 0 && num2 ==0) {
                System.out.println("덧셈을 종료합니다.");
                break;
            }
            System.out.println("num1 + num2 = " + (num1 + num2));
            System.out.println();
        }

    }
}
