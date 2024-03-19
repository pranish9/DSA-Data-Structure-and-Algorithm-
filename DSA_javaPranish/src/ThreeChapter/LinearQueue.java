
import java.util.Scanner;
import java.util.EmptyStackException;

class LinearQueue {
    private int front, rear, capacity;
    private int[] queue;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty())
            front = 0;
        queue[++rear] = item;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int item = queue[front];
        if (front == rear)
            front = rear = -1;
        else
            front++;
        return item;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();
        LinearQueue queue = new LinearQueue(capacity);

        System.out.println("Linear Queue Operations:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Queue is full");
                    } else {
                        for(int i = 0; capacity > i ; i++) {
                            System.out.print("Enter element to enqueue: ");
                            int element = scanner.nextInt();
                            queue.enqueue(element);
                        }
                    }
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        int dequeued = queue.dequeue();
                        System.out.println("Dequeued element: " + dequeued);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);

        scanner.close();
    }

}


