public class Day041_FibonacciNumber {
    public static int fibRecursion(int n) {
        if (n <= 1) return n;
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    public static int fibDP(int n) {

        if (n <= 1) return n;

        int prev2 = 0;
        int prev1 = 1;
        int curr = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;      
        }

        return curr;
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci Series:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("fib(" + i + ") = " + fibDP(i));
        }

        System.out.println();
        System.out.println("--- Approach Comparison ---");
        System.out.println("fib(10) Recursion: " + fibRecursion(10));
        System.out.println("fib(10) DP:        " + fibDP(10));
    }
}
