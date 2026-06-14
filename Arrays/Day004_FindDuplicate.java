import java.util.HashMap;

public class Day004_FindDuplicate {
    
    public static int findDuplicate(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            if (map.containsKey(arr[i])) {
                return arr[i];
            }

            map.put(arr[i], 1);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 2 , 2};

        int result = findDuplicate(arr);

        System.out.println("Duplicate Element: " + result);
    }
}
