package SecondChapter;

import java.util.EmptyStackException;

class DynamicStack {
    private int capacity;
    private int[] stack;
    private int top;

    public DynamicStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    private void expandStack() {
        int newCapacity = capacity * 2;
        int[] newStack = new int[newCapacity];
        System.arraycopy(stack, 0, newStack, 0, capacity);
        stack = newStack;
        capacity = newCapacity;
    }

    public void push(int item) {
        if (isFull()) {
            expandStack();
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // This will trigger resizing of the stack

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
//Instructions
//Write a Java program to implement a dynamic stack, that automatically adjusts its size as elements are added or removed.
//Develop a Java program demonstrating the implementation of a linear queue:
// This program should prompt the user to specify the desired queue size and user needs to input the enqueue elements accordingly. Also, show dequeue operations.
//P.S: Provide screenshots of your Java Code with outputs in submission.

