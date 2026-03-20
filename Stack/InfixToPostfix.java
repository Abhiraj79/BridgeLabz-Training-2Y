import java.util.Stack;

public class InfixToPostfix {

    // Function to return precedence
    public static int precedence(char ch) {
        switch (ch) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
        }
        return -1;
    }

    // Function to convert infix to postfix
    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If operand → add to result
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }

            // If '(' → push
            else if (ch == '(') {
                stack.push(ch);
            }

            // If ')' → pop till '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // remove '('
            }

            // If operator
            else {
                while (!stack.isEmpty() && 
                       precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "A+B*(C-D)";

        System.out.println("Infix: " + exp);
        System.out.println("Postfix: " + infixToPostfix(exp));
    }
}