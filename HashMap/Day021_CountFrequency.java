import java.util.HashMap;
import java.util.Scanner;

public class Day021_CountFrequency {
    
    public static void countFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println("Frequency of each element:");
        for (int key : map.keySet()) {
            System.out.println(key + " => " + map.get(key) + " times");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countFrequency(arr);

        sc.close();
    }
}
