import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative method comparing start and end
    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reversal
    public static boolean isPalindromeArray(String str) {
        char[] original = str.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = str.charAt(str.length() - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = sc.nextLine();

        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeArray(input);

        System.out.println("Palindrome check using iterative method: " + (result1 ? "Yes" : "No"));
        System.out.println("Palindrome check using recursive method: " + (result2 ? "Yes" : "No"));
        System.out.println("Palindrome check using character array method: " + (result3 ? "Yes" : "No"));
    }
}
