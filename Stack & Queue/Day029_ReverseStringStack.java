import java.util.Stack;

public class Day029_ReverseStringStack {
     public static String reverseString(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String[] tests = {"hello", "java", "stack", "coding"};

        for (String test : tests) {
            System.out.println("Input:  \"" + test + "\"");
            System.out.println("Output: \"" + reverseString(test) + "\"");
            System.out.println();
        }
    }
}
