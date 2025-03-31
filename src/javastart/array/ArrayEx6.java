package javastart.array;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;


        System.out.printf("입력받을 숫자의 개수를 입력하시오 : ");
        count = scan.nextInt();


        int[] nums = new int[count];
        int max = nums[0];
        int min = nums[0];
        for(int i=0; i< nums.length;i++)
        {
            System.out.printf("정수를 입력하시오 : ");
            nums[i] = scan.nextInt();

        }
        for(int i = 0; i< nums.length;i++)
        {
            max = min = nums[0];
            if(nums[i] > max)
            {
             max = nums[i];
            }
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }

        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);


    }
}
