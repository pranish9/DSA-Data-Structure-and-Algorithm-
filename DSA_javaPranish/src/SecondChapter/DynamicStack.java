import java.util.LinkedList;
import java.util.List;

public class DynamicStack {
    private List<Integer> stackDynamic = new LinkedList<>();

    public void push(int item) {
        stackDynamic.add(item);
        System.out.println("Push :" + item);
    }

    public void pop() {
        if (stackDynamic.isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        int lastIndex = stackDynamic.size() - 1;
        int poppedItem = stackDynamic.get(lastIndex);
        stackDynamic.remove(lastIndex);
        System.out.println("Popped Item is:" + poppedItem);
    }

    public void peek() {
        if (stackDynamic.isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Top element for stack is:" + stackDynamic.get(stackDynamic.size() - 1));
    }

    public void size() {
        System.out.println("The size of the dynamic stack is:" + stackDynamic.size());
    }

    public static void main(String[] args) {
        DynamicStack ds = new DynamicStack();

        ds.push(1);
        ds.push(2);
        ds.push(3);
        ds.push(4);
        ds.push(5);

        ds.size();
        ds.peek();

        ds.pop();

        ds.size();
        ds.push(6);
        ds.pop();
        ds.size();
    }
}
