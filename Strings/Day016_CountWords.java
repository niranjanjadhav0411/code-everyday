import java.util.Scanner;

public class Day016_CountWords {
    
    public static int countWords(String str) {

        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        String[] words = str.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int result = countWords(str);

        System.out.println("Word Count: " + result);

        sc.close();
    }
}
