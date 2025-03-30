package array;
import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<nums.length;i++){
            System.out.printf("숫자를 입력하시오 : ");
            nums[i] = scan.nextInt();


        }
        for(int i=0;i<nums.length;i++)
        {

            System.out.print(nums[i]);
            if(i<nums.length-1)
            {
                System.out.printf(",");
            }
        }
        System.out.println("");

        for(int i=nums.length-1;i>=0;i--)
        {

            System.out.print(nums[i]);
            if(i>=1)
            {
                System.out.printf(",");
            }
        }

    }
}
