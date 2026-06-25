import java.util.Scanner;

public class Day014_CheckAnagram {
    
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26];

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            count[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Yes they are Anagram!");
        } else {
            System.out.println("No they are Not Anagram!");
        }

        sc.close();
    }
}
