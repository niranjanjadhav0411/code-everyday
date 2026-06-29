import java.util.Scanner;

public class Day018_CheckEqualStrings {
    
    public static boolean areEqual(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
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

        if (areEqual(str1, str2)) {
            System.out.println("Yes they are Equal!");
        } else {
            System.out.println("No they are Not Equal!");
        }

        sc.close();
    }
}
