package javaMid2.collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {


        Integer[] inputArr = {30,20,20,10,10};
        Set<Integer> newSet = new HashSet<>();
        for(Integer input:inputArr)
        {
            newSet.add(input);
        }
        for(Integer s : newSet)
        {
            System.out.println("s = " + s);
        }


    }
}
