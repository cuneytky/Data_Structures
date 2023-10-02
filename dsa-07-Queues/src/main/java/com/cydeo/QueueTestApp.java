package com.cydeo;

public class QueueTestApp {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println("Size of queue is: "+ mq.size); // Size of queue is: 3
        System.out.println("Front is: "+mq.peek());        // Front is: 1
        System.out.println("First remove from queue: "+mq.dequeue()); // First remove from queue: 1
        System.out.println("Front is: "+ mq.peek());      // Front is: 2

    }
}
