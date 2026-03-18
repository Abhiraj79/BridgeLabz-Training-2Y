// Node class
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Linked Stack class
class LinkedStack<T> {
    private Node<T> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    // Push
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        T value = top.data;
        top = top.next;
        size--;
        return value;
    }

    // Peek
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // Size
    public int size() {
        return size;
    }

    // Display
    public void display() {
        Node<T> temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// Main class
public class StackGenericsList {
    public static void main(String[] args) {

        LinkedStack<Integer> stack = new LinkedStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.peek());

        stack.display();
    }
}