package javaMid2.collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{
    private static final int DEFAULT_CAPACITY =5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList()
    {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int initialCapacity)
    {
        elementData = new Object[initialCapacity];
    }
    @Override
    public int size()
    {
        return size;
    }
    @Override
    public void add(E e)
    {   // 코드 추가
        if(size == elementData.length)
        {
            grow();
        }
        elementData[size] = e;
        size++;
    }
    @Override
    public void add(int index, E e)
    {
        if(size == elementData.length)
        {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;

    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }

    }
    @Override
    public E remove(int index)
    {
        E object = get(index);
        shiftLeftFrom(index);

        size --;
        elementData[size] = null;
        return object;
    }

    private void shiftLeftFrom(int index) {

        for (int i = index; i < size-1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    // 코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        elementData = Arrays.copyOf(elementData,newCapacity);
    }
    @Override
    @SuppressWarnings("unchecked")
    public E get(int index)
    {
        return (E)elementData[index];
    }

    @Override
    public E set(int index, E element)
    {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public int indexOf(Object o)
    {
        for(int i=0; i<size;i++)
        {
            if(o.equals(elementData[i]))
            {return i;}
        }
        return -1;
    }

    @Override
    public String toString()
    {
        //return Arrays.toString(elementData);
        return Arrays.toString(Arrays.copyOf(elementData, size))+
                " size = "+size+", capacity = "+elementData.length; //배열의 size만큼만 카피

    }

}
