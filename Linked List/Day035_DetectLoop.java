public class Day035_DetectLoop {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    public static void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public static boolean hasLoop() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);

        System.out.println("List: 1 -> 2 -> 3 -> 4 -> 5 -> null");
        System.out.println("Has Loop: " + hasLoop());
        System.out.println();

        head = null;
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        head = n1;

        System.out.println("List: 1 -> 2 -> 3 -> 4 -> 5 -> back to 3");
        System.out.println("Has Loop: " + hasLoop());
    }
}
