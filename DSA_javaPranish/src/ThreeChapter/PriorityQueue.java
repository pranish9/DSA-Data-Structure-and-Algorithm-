package ThreeChapter;

import java.util.Scanner;

public class PriorityQueue {
    private static int front = -1;
    private static int rear = -1;
    private static int maxSize;
    private static int[] priority;
    private static int[] queue;

    public static void main(String[] args) {
        System.out.println("please enter the size of the priority queue");
        Scanner sc = new Scanner(System.in);
        maxSize = sc.nextInt();
        queue = new int[maxSize];
        priority = new int[maxSize];

        while (rear<maxSize-1){
            System.out.println("Enter value for queue insertation ");
            int value = sc.nextInt();
            System.out.println("Enter the priority value");
            int priorityValue = sc.nextInt();
            insert(value, priorityValue);
        }
    }

    public static void insert(int value , int priorityValue) {
        rear++;
        int position = rear;
        while (position > 0 && priorityValue > priority[position - 1]){
            queue[position] = value;
            priority[position] = priorityValue;
            if (rear == maxSize-1){
                System.out.println(" Queue Overflow");
            }
        }
    }
}
