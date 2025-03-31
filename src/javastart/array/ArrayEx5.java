package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {


        int sum = 0;
        double avg ;
        int count;

        Scanner scan = new Scanner(System.in);
        System.out.printf("입력받을 숫자의 개수를 입력하시오 : ");
        count = scan.nextInt();
        int[] nums = new int[count];
        for(int i = 0; i<nums.length;i++)
        {

            System.out.printf("정수를 입력하시오 : ");
            nums[i] = scan.nextInt();
            sum+=nums[i];
        }
        avg = (double) sum/nums.length;

        System.out.println("입력한 정수의 합계 : "+sum);
        System.out.println("입력한 정수의 평균 : "+avg);
    }
}
