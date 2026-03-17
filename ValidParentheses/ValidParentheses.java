import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {

            // Push opening brackets
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } 
            // Handle closing brackets
            else if (c == ')' || c == ']' || c == '}') {

                // If stack empty → invalid
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                // Check matching
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // If stack empty → valid
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s)); // true
    }
}