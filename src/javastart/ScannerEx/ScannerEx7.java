package javastart.ScannerEx;
import java.util.Scanner;
public class ScannerEx7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        double count = 0;
        double avg;
        while(true)
        {
            System.out.printf("숫자를 입력하시오(-1을 입1하면 종료) : ");
            int num = scan.nextInt();


            if(num == -1)
            {
                System.out.println("입력을 종료합니다.");
                break;
            }

            sum += num;
            count++;

        }
        /*
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
         */

        avg = sum/count;
        System.out.println("입력한 숫자들의 합계 : "+ sum);
        System.out.println("입력한 숫자들의 평균 : "+ avg);
    }
}
