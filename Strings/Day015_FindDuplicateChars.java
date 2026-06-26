import java.util.Scanner;

public class Day015_FindDuplicateChars {
    
    public static void findDuplicates(String str) {

        int[] count = new int[26];

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count[str.charAt(i) - 'a']++;
            }
        }

        System.out.print("Duplicate characters: ");
        boolean found = false;

        for (int i = 0; i < 26; i++) {
            if (count[i] > 1) {
                System.out.print((char)(i + 'a') + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicates found!");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        findDuplicates(str);

        sc.close();
    }
}
