package javaMid1.lang.math;

import java.util.Random;

public class lotto {

    private final Random ran = new Random();
    private final int[] lotto = new int[6];
    private int num = 0;

    public int[] getLotto()
    {
        for(int i=0; i<6; i++)
        {
            num = ran.nextInt(45)+1;
            if(noSame(num))
            {
                lotto[i] = num;
            }
            else
            {
                i--;
            }
        }
        return lotto;
    }

    private boolean noSame(int num)
    {
        for(int a : lotto)
        {
            if(num == a)
            {
                return false;
            }
        }
        return true;
    }

}
