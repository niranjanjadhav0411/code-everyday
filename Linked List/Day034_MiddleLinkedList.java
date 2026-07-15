public class Day034_MiddleLinkedList {
    
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

    public static int findMiddle() {

        Node slow = head; 
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;   
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" → ");
            current = current.next;
        }
        System.out.println(" → null");
    }

    public static void main(String[] args) {

        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);

        printList();
        System.out.println("Middle Node: " + findMiddle());
        System.out.println();

        head = null;
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);

        printList();
        System.out.println("Middle Node: " + findMiddle());
    }
}
