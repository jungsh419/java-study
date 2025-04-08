package javabasic.static1;

public class MathArrayUtils {

    private MathArrayUtils(){}


    static int sum(int[] array)
    {
        int sum = 0;
        for(int i : array)
        {
            sum+=i;
        }
        return sum;
    }
    static double avg(int[] array)
    {
        return (double)sum(array)/array.length;
    }
    static int min(int[] array)
    {
        int min = array[0];
        for(int i =0; i<array.length;i++)
        {
             if(min > array[i])
             {
                 min = array[i];
             }
        }
        return min;
    }
    static int max(int[] array)
    {
        int max = array[0];
        for(int i =0; i<array.length;i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
        return max;
    }

}
