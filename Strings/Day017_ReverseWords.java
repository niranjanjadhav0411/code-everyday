import java.util.Scanner;

public class Day017_ReverseWords {
    
    public static String reverseWords(String str) {

        String[] words = str.trim().split("\\s+");

        int left = 0;
        int right = words.length - 1;

        while (left < right) {

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = reverseWords(str);

        System.out.println("Reversed Words: " + result);

        sc.close();
    }
}
