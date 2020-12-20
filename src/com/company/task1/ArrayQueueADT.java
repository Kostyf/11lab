package com.company.task1;

public class ArrayQueueADT<T> {
    /*
    инвариант:
    FIFO - first in first out - первым всегда будет извлечен элемент, который был добавлен раньше всех других.
                                последним будет извлечен элемент, который был добавлен последним
    */


    //assert: queue is not full
    //adds element at the end of the queue, after enqueue -> size++
    public void enqueue(T element, ArrayQueue<T> queue)
    {
        queue.enqueue(element);
    }

    //assert: queue is not empty
    //returns element from the beginning of the queue, after element -> size the same
    public T element(ArrayQueue<T> queue)
    {
        return queue.element();
    }

    //assert: queue is not empty
    //returns and deletes element from the beginning of the queue, after dequeue -> size--
    public T dequeue(ArrayQueue<T> queue)
    {
        return queue.dequeue();
    }

    //assert: no
    //return size of the queue
    public int size(ArrayQueue<T> queue)
    {
        return queue.size();
    }

    //assert: no
    //returns size of the queue
    public boolean isEmpty(ArrayQueue<T> queue)
    {
        return queue.isEmpty();
    }

    //assert: no
    //clears the queue, after clear -> size = 0
    public void clear(ArrayQueue<T> queue)
    {
        while(!queue.isEmpty())
            queue.dequeue();
    }
}