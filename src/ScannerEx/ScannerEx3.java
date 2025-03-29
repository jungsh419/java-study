package ScannerEx;
import java.util.Scanner;
public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("음식의 이름을 입력 : ");
        String fName = scan.nextLine();
        System.out.printf("가격을 입력 : ");
        int fPrice = scan.nextInt();
        System.out.printf("수량을 입력 : ");
        int fQuantity = scan.nextInt();

        System.out.println(fName +" "+fQuantity+"개를 주문하셨습니다. 가격은 : "+ (fPrice*fQuantity)+"원입니다.");
    }
}
