public class Day026_StackUsingArray {
    
    static int[] arr = new int[100];
    static int top = -1;

    public static void push(int element) {
        if (top == arr.length - 1) {
            System.out.println("Stack is Full!");
            return;
        }
        arr[++top] = element;
        System.out.println(element + " pushed to stack");
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }

    public static int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[top];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);

        System.out.println("Top element: " + peek());
        System.out.println("Popped: " + pop());
        System.out.println("Popped: " + pop());
        System.out.println("Is Empty: " + isEmpty());
        System.out.println("Popped: " + pop());
        System.out.println("Is Empty: " + isEmpty());
    }
}
