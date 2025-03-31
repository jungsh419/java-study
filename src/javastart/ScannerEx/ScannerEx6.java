package ScannerEx;
import java.util.Scanner;
public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num1;
        int num2;

        System.out.printf("첫 번째 숫자를 입력하시오 : ");
        num1 = scan.nextInt();

        System.out.printf("두 번째 숫자를 입력하시오 : ");
        num2 = scan.nextInt();

        System.out.printf("두 숫자 사이의 모든 정수 : ");
        boolean b = (num1 >= num2) ? true:false;
        if(b)
        {
            for(int i=num1-1; i>num2;i--)
            {
                System.out.print(i);

                if(i!=num2+1)
                {
                    System.out.printf(", ");
                }
            }

        }
        else
        {
            for(int i=num2-1; i>num1; i--)
            {
                System.out.print(i);

                if(i!=num1+1)
                {
                    System.out.printf(", ");
                }
            }
        }
    }
}
