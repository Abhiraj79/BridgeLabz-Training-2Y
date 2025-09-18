class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "madam";
        p1.displayResult();

        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "hello";
        p2.displayResult();
    }
}
