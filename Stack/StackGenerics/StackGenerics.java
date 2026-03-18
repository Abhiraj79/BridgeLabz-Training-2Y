// Generic Stack implementation using arrays
class Stack<T> {
    private T[] arr;       // Array to store stack elements
    private int top;       // Index of the top element
    private int capacity;  // Maximum capacity of the stack

    // Constructor
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        capacity = size;
        arr = (T[]) new Object[size]; // Create generic array
        top = -1;
    }

    // Push operation
    public void push(T item) {
        if (isFull()) {
            throw new RuntimeException("Stack Overflow");
        }
        arr[++top] = item;
    }

    // Pop operation
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return arr[top--];
    }

    // Peek operation
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    // Utility methods
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }
}

// Main class to test the generic stack
public class StackGenerics {
    public static void main(String[] args) {
        // Stack of Integers
        Stack<Integer> intStack = new Stack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Top element (Integer): " + intStack.peek()); // 30
        System.out.println("Removed (Integer): " + intStack.pop());      // 30
        System.out.println("Current size (Integer): " + intStack.size()); // 2

        // Stack of Strings
        Stack<String> stringStack = new Stack<>(5);
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Top element (String): " + stringStack.peek()); // World
        System.out.println("Removed (String): " + stringStack.pop());      // World
        System.out.println("Current size (String): " + stringStack.size()); // 1
    }
}