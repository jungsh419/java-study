package javaMid1.lang.math;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LottoMain {
    public static void main(String[] args)
    {
        int[] res = new int[6];
        lotto lotto = new lotto();
        System.out.println("로또 결과 : "+ Arrays.toString(lotto.getLotto()));
    }
}
