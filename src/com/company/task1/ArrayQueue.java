package com.company.task1;

public class ArrayQueue<T> {
    /*
    инвариант:
    FIFO - first in first out - первым всегда будет извлечен элемент, который был добавлен раньше всех других.
                                последним будет извлечен элемент, который был добавлен последним
    */

    private final int MAXSIZE;
    private Object[] arr;
    private int size;

    private int first;
    private int last;
    public ArrayQueue()
    {
        this(10);
    }
    public ArrayQueue(int capacity)
    {
        MAXSIZE = capacity;
        arr = new Object[MAXSIZE];
        first = 0;
        last = -1;
    }


    //assert: queue is not full
    //adds element at the end of the queue, after enqueue -> size++
    public void enqueue(T element)
    {
        if(last == MAXSIZE-1)
            last = -1;
        arr[++last] = element;
        size++;
    }

    //assert: queue is not empty
    //returns and deletes element from the beginning of the queue, after dequeue -> size--
    public T dequeue()
    {
        T temp = (T)arr[first++];
        if(first == MAXSIZE)
            first = 0;
        size--;
        return temp;
    }

    //assert: queue is not empty
    //returns element from the beginning of the queue, after element -> size the same
    public T element()
    {
        return (T)arr[0];
    }

    //assert: no
    //return size of the queue
    public int size()
    {
        return size;
    }

    //assert: no
    //returns size of the queue
    public boolean isEmpty()
    {
        return size==0;
    }

    //assert: no
    //clears the queue, after clear -> size = 0
    public void clear()
    {
        while(!isEmpty())
            dequeue();
    }
}