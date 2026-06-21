public class Day010_MissingNumber {
    
    public static int findMissing(int[] arr, int n) {

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for(int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;

        int result = findMissing(arr, n);

        System.out.println("Missing Number: " + result);
    }
}
