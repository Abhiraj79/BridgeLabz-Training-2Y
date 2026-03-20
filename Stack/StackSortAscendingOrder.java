import java.util.Stack;

public class SortStackRecursion {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Sort remaining stack
        sortStack(stack);

        // Insert element in sorted order
        insertInSortedOrder(stack, top);
    }

    // Function to insert element in sorted way
    public static void insertInSortedOrder(Stack<Integer> stack, int x) {
        // Your condition: stack empty OR peek <= x
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursive call
        insertInSortedOrder(stack, x);

        // Push back the removed element
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack (Ascending): " + stack);
    }
}