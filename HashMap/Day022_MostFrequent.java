import java.util.HashMap;
import java.util.Scanner;

public class Day022_MostFrequent {
    
    public static int mostFrequent(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxCount = 0;
        int maxElement = 0;

        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                maxElement = key;
            }
        }

        return maxElement;
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

        int result = mostFrequent(arr);

        System.out.println("Most Frequent Element: " + result);

        sc.close();
    }
}
