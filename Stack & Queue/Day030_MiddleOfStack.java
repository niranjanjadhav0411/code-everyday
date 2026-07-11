import java.util.Stack;

public class Day030_MiddleOfStack {
    
    public static int findMiddle(Stack<Integer> stack) {

        int size = stack.size();
        int[] arr = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }

        for (int i = 0; i < size; i++) {
            stack.push(arr[i]);
        }

        int midddleIndex = size / 2;

        return arr[midddleIndex];
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);

        System.out.println("Stack: [1, 2, 3, 4, 5]");
        System.out.println("Middle Element: " + findMiddle(stack1));
        System.out.println();

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);

        System.out.println("Stack: [1, 2, 3, 4]");
        System.out.println("Middle Element: " + findMiddle(stack2));
    }
}
