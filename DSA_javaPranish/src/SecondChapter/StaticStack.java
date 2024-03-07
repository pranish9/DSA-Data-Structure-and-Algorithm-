package SecondChapter;

import java.util.Scanner;

public class StaticStack {
    public static void main(String[] args) {
        int[] array; //initiallization
        System.out.println("please enter the size of Stack");
        Scanner sc = new Scanner(System.in);
        int maxSize = sc.nextInt(); // Size of the stack
        array = new int[maxSize];
        int top = -1;
        while (true){
            if(top == maxSize-1){
                System.out.println("Stack Overflow");
                break;
            }
            else{
                top++;
                System.out.println("Please enter element for stack");
                array[top]=sc.nextInt();
            }
        }
        System.out.println("Do you want to pop?");
        if(sc.next().equalsIgnoreCase("Y")){
            while (true){
                if (top == -1){
                    System.out.println("Stack Underflow");
                    break;
                }
                else {
                    System.out.println("the element pooped is:" +array[top]);
                    top--;
                }
            }
        }
    }



}
