// Node class for linked list
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Generic Stack implementation using linked list
class LinkedStack<T> {
    private Node<T> top;   // Top of the stack
    private int size;      // Current size of the stack

    public LinkedStack() {
        top = null;
        size = 0;
    }

    // Push operation
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop operation
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    // Peek operation
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Utility methods
    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}

// Main class to test the linked list stack
public class StackGenericsList {
    public static void main(String[] args) {
        // Stack of Integers
        LinkedStack<Integer> intStack = new LinkedStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Top element (Integer): " + intStack.peek()); // 30
        System.out.println("Removed (Integer): " + intStack.pop());      // 30
        System.out.println("Current size (Integer): " + intStack.size()); // 2

        // Stack of Strings
        LinkedStack<String> stringStack = new LinkedStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Top element (String): " + stringStack.peek()); // World
        System.out.println("Removed (String): " + stringStack.pop());      // World
        System.out.println("Current size (String): " + stringStack.size()); // 1
    }
}