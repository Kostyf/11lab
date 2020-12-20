package com.company.task2;

import java.util.NoSuchElementException;

public interface MyQueue<E> {

    /** Inserts the specified element into this queue if it is possible to do
     * @param e the element to add
     * @return {@code true} if the element was added to this queue, else {@code false}
     */
    void add(E e);

    /**
     * Retrieves and removes the head of this queue.
     * @return the head of this queue
     * @throws NoSuchElementException if this queue is empty
     */
    E remove();

    /**
     * Retrieves and removes the head of this queue
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    E poll();

    /**
     * Retrieves, but does not remove, the head of this queue
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    E peek();
}