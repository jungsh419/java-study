package javastart.array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {

        int[][] grade = new int[4][3];
        Scanner scan = new Scanner(System.in);
        int[] total = new int[4];
        double[] avg = new double[4];


        for(int i=0;i<grade.length;i++)
        {
            System.out.println(i+1 + "번 학생의 성적을 입력하시오");
            System.out.printf("국어 : ");
            grade[i][0] = scan.nextInt();
            System.out.printf("수학 : ");
            grade[i][1] = scan.nextInt();
            System.out.printf("영어 : ");
            grade[i][2] = scan.nextInt();

            for(int j=0; j<grade[i].length;j++)
            {
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
