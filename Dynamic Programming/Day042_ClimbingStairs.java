public class Day042_ClimbingStairs {
    public static int climbStairs(int n) {

        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev2 = 1;
        int prev1 = 2;
        int curr = 0;

        for (int i = 3; i <= n; i++) {
            curr = prev1 + prev2; 
            prev2 = prev1; 
            prev1 = curr;
        }

        return curr;
    }

    public static void main(String[] args) {

        System.out.println("Climbing Stairs:");
        System.out.println();

        for (int i = 1; i <= 8; i++) {
            System.out.println("n = " + i +
                " → " + climbStairs(i) + " ways");
        }

        System.out.println();

        System.out.println("All ways for n = 4:");
        System.out.println("1+1+1+1");
        System.out.println("1+1+2");
        System.out.println("1+2+1");
        System.out.println("2+1+1");
        System.out.println("2+2");
        System.out.println("Total: 5 ways ✅");
    }
}
