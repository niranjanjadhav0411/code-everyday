import java.util.HashSet;
import java.util.Scanner;

public class Day024_FindAllPairs {
    
    public static void findPairs(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        System.out.println("Pairs with sum " + target + ":");

        for (int i = 0; i < arr.length; i++) {

            int need = target - arr[i];

            if (set.contains(need)) {
                System.out.println("(" + need + ", " + arr[i] + ")");
                found = true;
            }

            set.add(arr[i]);
        }

        if (!found) {
            System.out.println("No pairs found!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        findPairs(arr, target);

        sc.close();
    }
}
