import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedListStack {

    public static Node reverseLinkedListWithStack(Node head) {
        Stack<Node> stack = new Stack<>();
        Node current = head;

        // Push all nodes into stack
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        if (stack.isEmpty()) {
            return null;
        }

        // New head
        Node newHead = stack.pop();
        current = newHead;

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            current.next = node;
            current = node;
        }

        current.next = null;

        return newHead;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseLinkedListWithStack(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}