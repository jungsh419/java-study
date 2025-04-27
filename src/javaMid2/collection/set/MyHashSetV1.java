package javaMid2.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
   static final int DEFAULT_INITIIAL_CAPACITY = 16;

   LinkedList<Integer>[] buckets;
   private int size = 0;
   private int capacity = DEFAULT_INITIIAL_CAPACITY;

   public MyHashSetV1()
   {
       initBucket();
   }

   public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBucket();
   }

   private void initBucket( ) {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
   }


    public boolean add(int value)
    {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if(bucket.contains(value))
        {
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue)
    {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);

    }
    public boolean remove(int removeValue)
    {
        int hashIndex = hashIndex(removeValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean res = bucket.remove(Integer.valueOf(removeValue));
        if(res){
            return true;
        }
        else{
            return false;
        }
    }

     private int hashIndex(int value)
    {
        return value%capacity;
    }


    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
