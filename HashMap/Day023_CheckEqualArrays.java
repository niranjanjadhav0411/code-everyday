import java.util.HashMap;
import java.util.Scanner;

public class Day023_CheckEqualArrays {
    
    public static boolean areEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                map.put(arr1[i], 1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {

            if (!map.containsKey(arr2[i])) {
                return false;
            }

            map.put(arr2[i], map.get(arr2[i]) - 1);

            if (map.get(arr2[i]) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter elements of array 1: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        System.out.println("Enter elements of array 2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        if (areEqual(arr1, arr2)) {
            System.out.println("Yes they are Equal!");
        } else {
            System.out.println("No they are Not Equal!");
        }

        sc.close();
    }
}
