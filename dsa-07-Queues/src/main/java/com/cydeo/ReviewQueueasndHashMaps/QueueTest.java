package com.cydeo.ReviewQueueasndHashMaps;

public class QueueTest {
    public static void main(String[] args) {
        QueueWithList<Integer> myQueue = new QueueWithList<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue()); // 1
        System.out.println(myQueue.dequeue()); // 2
    }
}
