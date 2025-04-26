package javaMid2.collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("숫자를 입력하시오");
        while(true) {

            int intValue = sc.nextInt();
            if(intValue == 0)
            {
                break;
            }
            nums.add(intValue);
        }
        System.out.println("출력");

        for (int i = 0; i < nums.size(); i++)
        {
            if(i == nums.size()-1)
            {
                System.out.println(nums.get(i));

            }
            else {
                System.out.printf(nums.get(i) + ", ");
            }
        }


    }
}
