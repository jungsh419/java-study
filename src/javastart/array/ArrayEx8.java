package javastart.array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] subject = {"국어", "수학", "영어"};

        System.out.printf("학생수를 입력하시오 : ");
        int count = scan.nextInt();
        int[][] grade = new int[count][3];
        int[] total = new int[count];
        double[] avg = new double[count];

        for(int i=0;i<grade.length;i++)
        {
            System.out.println(i+1 + "번 학생의 성적을 입력하시오");

            for(int j=0; j<grade[i].length;j++)
            {
                System.out.printf(subject[j] + " 점수 : ");
                grade[i][j] = scan.nextInt();
                total[i] += grade[i][j];
            }

            avg[i] = (double)total[i]/grade[i].length;

        }

        for(int k= 0; k<grade.length;k++)
        {
            System.out.println(k+1 +"번 학생의 총점 : "+ total[k] + ", 평균 : "+ avg[k]);
        }
    }
}
