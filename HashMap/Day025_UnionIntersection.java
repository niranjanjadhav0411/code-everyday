import java.util.HashSet;

public class Day025_UnionIntersection {
    
    public static void findUnion(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        System.out.println("Union: " + set);
    }

    public static void findIntersection(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        System.out.print("Intersection: ");
        boolean found = false;

        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No commom elements!");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.println("Array 1: [1, 2, 3, 4, 5]");
        System.out.println("Array 2: [3, 4, 5, 6, 7]");
        System.out.println();

        findUnion(arr1, arr2);
        findIntersection(arr1, arr2);
    }
}
