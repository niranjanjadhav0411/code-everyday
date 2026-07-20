public class Day039_MaxNodeTree {
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

    public static int findMax(Node root) {

        if (root == null) return Integer.MIN_VALUE;

        int leftMax = findMax(root.left);

        int rightMax = findMax(root.right);

        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {

        Node root1 = new Node(1);
        root1.left = new Node(7);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(9);
        root1.right.right = new Node(6);

        System.out.println("Tree 1:");
        System.out.println("        1");
        System.out.println("       / \\");
        System.out.println("      7   3");
        System.out.println("     / \\   \\");
        System.out.println("    4   9   6");
        System.out.println("Maximum Node: " + findMax(root1));
        System.out.println();

        Node root2 = new Node(5);
        root2.left = new Node(3);
        root2.right = new Node(8);
        root2.left.left = new Node(1);
        root2.right.right = new Node(10);

        System.out.println("Tree 2:");
        System.out.println("      5");
        System.out.println("     / \\");
        System.out.println("    3   8");
        System.out.println("   /     \\");
        System.out.println("  1       10");
        System.out.println("Maximum Node: " + findMax(root2));
    }
}
