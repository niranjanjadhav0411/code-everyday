public class Day038_CountNodes {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int countNodes(Node root) {

        if (root == null)  return 0;

        int leftCount = countNodes(root.left);

        int rightCount = countNodes(root.right);

        return 1 + leftCount + rightCount;
    }

    public static void main(String[] args) {

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(6);

        System.out.println("Tree 1:");
        System.out.println("        1");
        System.out.println("       / \\");
        System.out.println("      2   3");
        System.out.println("     / \\   \\");
        System.out.println("    4   5   6");
        System.out.println("Total Nodes: " + countNodes(root1));
        System.out.println();

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.left.left = new Node(3);

        System.out.println("Tree 2:");
        System.out.println("    1");
        System.out.println("   /");
        System.out.println("  2");
        System.out.println(" /");
        System.out.println("3");
        System.out.println("Total Nodes: " + countNodes(root2));
    }
}
