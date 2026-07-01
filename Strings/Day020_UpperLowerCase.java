import java.util.Scanner;

public class Day020_UpperLowerCase {
    
    public static String toUpperCase(String str) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 32);
            }
        }

        return new String(chars);
    }

    public static String toLowerCase(String str) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + 32);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Uppercase: " + toUpperCase(str));
        System.out.println("Lowercase: " + toLowerCase(str));

        sc.close();
    }
}
