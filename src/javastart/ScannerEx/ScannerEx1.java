package javastart.ScannerEx;
import java.util.Scanner;
public class ScannerEx1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("이름을 입력하시오 : ");
        String name = scan.nextLine();
        System.out.printf("나이를 입력하시오 : ");
        int age = scan.nextInt();

        System.out.println("당신의 이름은 "+ name+"이고, "+"나이는 "+age+ "살입니다.");

    }
}
