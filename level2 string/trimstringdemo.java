import java.util.Scanner;

public class TrimStringDemo {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = 0;
        int length = 0;
        while (true) {
            try { text.charAt(length); length++; }
            catch (IndexOutOfBoundsException e) { break; }
        }

        while (start < length && text.charAt(start) == ' ') start++;
        end = length - 1;
        while (end >= 0 && text.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    public static String substringCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) result += text.charAt(i);
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String trimmedByCharAt = substringCharAt(text, indexes[0], indexes[1]);
        String trimmedByBuiltIn = text.trim();

        System.out.println("Trimmed using charAt(): \"" + trimmedByCharAt + "\"");
        System.out.println("Trimmed using trim(): \"" + trimmedByBuiltIn + "\"");
        System.out.println("Are both results same? " + compareStrings(trimmedByCharAt, trimmedByBuiltIn));

        sc.close();
    }
}
