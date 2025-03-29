package ScannerEx;
import java.nio.Buffer;
import java.util.Scanner;
public class ScannerWhile1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.printf("문자열을 입력하세요 : ");
            String str = scan.nextLine();

            if(str.equals("exit")){
                System.out.println("입력을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : "+ str);

        }
    }
}
