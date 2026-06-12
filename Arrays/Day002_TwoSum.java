import java.util.HashMap;

public class Day002_TwoSum {
    
    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {

            int need = target - arr[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args){

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
