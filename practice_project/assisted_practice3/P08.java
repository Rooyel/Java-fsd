package practice_project.assisted_practice3;

import java.util.EmptyStackException;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " into the stack");
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = stackArray[top--];
        System.out.println("Popped " + value + " from the stack");
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class P08 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        // Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Popping element from the stack
        stack.pop();
        
        // Pushing another element
        stack.push(40);
        
        // Popping all elements
        while (!stack.isEmpty()) {
            stack.pop();
        }
        
        // Trying to pop from empty stack
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Tried to pop from an empty stack.");
        }
    }
}
