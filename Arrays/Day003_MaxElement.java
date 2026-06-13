public class Day003_MaxElement {
    
    public static int findMax(int[] arr) {

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args){
        
        int[] arr = {3, 7, 1, 9, 4};

        int result = findMax(arr);

        System.out.println("Maximum Element: " + result);
    }
}
