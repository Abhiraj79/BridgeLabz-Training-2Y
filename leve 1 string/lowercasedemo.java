import java.util.Scanner;

public class LowerCaseDemo {

    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            result = result + c;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String lowerByCharAt = convertToLower(text);
        String lowerByBuiltIn = text.toLowerCase();

        boolean same = compareStrings(lowerByCharAt, lowerByBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerByCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerByBuiltIn);
        System.out.println("Are both results same? " + same);

        sc.close();
    }
}
