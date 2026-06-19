public class Day009_MoveZeros {
    
    public static void  moveZeros(int[] arr){

        int left = 0;

        for(int right = 0; right < arr.length; right++) {

            if (arr[right] != 0) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        System.out.print("Before: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        moveZeros(arr);

        System.out.print("\nAfter: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
