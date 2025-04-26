package javaMid2.collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("숫자를 입력하시오");
        int total = 0;
        double avg = 0;
        while(true) {

            int intValue = sc.nextInt();
            if(intValue == 0)
            {
                break;
            }
            nums.add(intValue);
        }
        for (int i = 0; i < nums.size(); i++) {
            total += nums.get(i);
        }
        avg = (double) total/nums.size();

        System.out.println("total = " + total);
        System.out.println("avg = " + avg);






    }
}
