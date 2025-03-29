package ScannerEx;
import java.util.Scanner;
public class ScannerWhile3 {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.printf("정수를 입력하시오 : ");
            int num1 = scan.nextInt();
            if(num1 == 0)
            {
                System.out.println("정수 입력을 종료합니다.");
                break;
            }
            count++;
            sum+=num1;



        }
        System.out.println("입력한 모든 정수의 합은 : " + sum);
        System.out.println("입력한 모든 정수의 개수는 : " + count);
    }
}
