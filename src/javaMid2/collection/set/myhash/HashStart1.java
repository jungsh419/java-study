package javaMid2.collection.set.myhash;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {

        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;

        for(Integer intValue : inputArray)
        {
            if(intValue == searchValue)
            {
                System.out.println("intValue = " + intValue);
            }

        }
    }
}
