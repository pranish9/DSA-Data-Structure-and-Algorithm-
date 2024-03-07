package FirstChapter;


import java.sql.SQLOutput;
import java.util.Scanner;

public class StackAndHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in a number" );
        int s = sc.nextInt();

                // control+shift+o to import dependencies
        while(true)
    {
            if (s % 2 == 0) {
                System.out.println("the number is even");
                break;
            } else {
                System.out.println("the number is odd");
                break;
            }
        }
    }
}
