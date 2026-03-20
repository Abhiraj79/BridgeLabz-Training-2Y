import java.util.Stack;

public class PostfixEvaluation {

    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If operand (digit)
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // convert char to int
            }
            // If operator
            else {
                int b = stack.pop();
                int a = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "23*54*+9-";

        System.out.println("Postfix Expression: " + exp);
        System.out.println("Result: " + evaluatePostfix(exp));
    }
}