public class Day027_QueueUsingArray {
    
    static int[] arr = new int[100];
    static int front = 0;
    static int rear = -1;
    static int size = 0;

    public static void enqueue(int element) {
        if (rear == arr.length - 1) {
            System.out.println("Queue is Full!");
            return;
        }
        arr[++rear] = element;
        size++;
        System.out.println(element + " added to queue");
    }

    public static int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        size--;
        return arr[front++];
    }

    public static int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {

        enqueue(1);
        enqueue(2);
        enqueue(3);

        System.out.println("Front element: " + peek());
        System.out.println("Dequeued: " + dequeue());
        System.out.println("Dequeued: " + dequeue());
        System.out.println("Is Empty: " + isEmpty());
        System.out.println("Dequeued: " + dequeue());
        System.out.println("Is Empty: " + isEmpty());
    }
}
