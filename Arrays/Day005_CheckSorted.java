public class Day005_CheckSorted {
    
    public static boolean isSorted(int[] arr){

        for(int i = 0; i < arr.length - 1; i++) {
            
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};

        if (isSorted(arr1)) {
            System.out.println("arr1: Yes, it is Sorted!");
        } else {
            System.out.println("arr1: No, it is Not Sorted!");
        }

        if (isSorted(arr2)) {
            System.out.println("arr2: Yes, it is Sorted!");
        } else {
            System.out.println("arr2: No, it is Not Sorted");
        }
    }
}
