package ThreeChapter;

import java.sql.SQLOutput;

public class OperationsQueue {
    private static int MAXSIZE = 10;
    private int[] queue = new int[MAXSIZE];
    private int front = -1;
    private int rear = -1;

    public void enqueue(int value){
        if(rear == MAXSIZE -1){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            queue[rear] = value;
            System.out.println("The value enqueued in queue is:" +queue[rear]);

            if(front == -1){
                front = rear;
            }
        }
    }

    public void dequeue(){
        if (front == -1){
            System.out.println("Queue os empty");
        }else{
            System.out.println("The value dequeued in queue is"+queue[front]);
            if(front == rear){
                front = -1;
                rear = -1;
            }else{
                front = front + 1;
            }
        }
    }
    public static void main(String[] args) {
        OperationsQueue queue = new OperationsQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }
}
