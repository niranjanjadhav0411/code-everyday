import java.util.Scanner;

public class Day019_FirstNonRepeating {
    
    public static char firstNonRepeating(String str) {

        int[] count = new int[26];

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i) - 'a'] == 1) {
                return str.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = firstNonRepeating(str);

        if (result == '-') {
            System.out.println("No Non-Repeating Character Found!");
        } else {
            System.out.println("First Non-Repeating Character: " + result);
        }

        sc.close();
    }
}
