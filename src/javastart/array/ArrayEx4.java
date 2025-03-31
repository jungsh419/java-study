package javastart.array;
import java.util.Scanner;
public class ArrayEx4 {
    public static void main(String[] args) {

        int[] nums = new int[5];
        int sum = 0;
        double avg ;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<nums.length;i++)
        {
            System.out.printf("정수를 입력하시오 : ");
            nums[i] = scan.nextInt();
            sum+=nums[i];
        }
        avg = sum/nums.length;

        System.out.println("입력한 정수의 합계 : "+sum);
        System.out.println("입력한 정수의 평균 : "+avg);


    }
}
