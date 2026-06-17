public class Day007_CountEvenOdd {
    
    public static void countEvenOdd(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        countEvenOdd(arr);
    }
}
