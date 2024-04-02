package practice_project.assisted_practice3;

import java.util.NoSuchElementException;

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        size++;
        System.out.println("Enqueued " + value + " into the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot dequeue.");
        }
        int value = queueArray[front];
        front = (front + 1) % maxSize;
        size--;
        System.out.println("Dequeued " + value + " from the queue");
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty. Cannot peek.");
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }
}

public class P09 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        
        // Enqueuing elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        // Dequeuing element from the queue
        queue.dequeue();
        
        // Enqueuing another element
        queue.enqueue(40);
        
        // Dequeuing all elements
        while (!queue.isEmpty()) {
            queue.dequeue();
        }
        
        // Trying to dequeue from empty queue
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Tried to dequeue from an empty queue.");
        }
    }
}
