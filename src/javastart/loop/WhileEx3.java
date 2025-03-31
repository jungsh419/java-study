package javastart.loop;

public class WhileEx3 {


    public static void main(String[] args)
    {

        int max = 100;
        int max2 = 100;
        int i = 1;
        int sum1 = 0;
        int sum2 = 0;

        while(i<=max)
        {
            sum1+=i;
            i++;
        }
        System.out.println(max + "까지의 합 : "+ sum1);

       for(int j = 1; j<=max2; j++)
       {
           sum2+=j;
       }
        System.out.println(max2 + "까지의 합: "+sum2);


    }



}
