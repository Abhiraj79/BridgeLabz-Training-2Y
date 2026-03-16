import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseLinkedList {

    Node head;

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Reverse using Stack
    void reverseUsingStack() {

        Stack<Integer> stack = new Stack<>();

        Node temp = head;

        // Push all elements into stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        // Pop elements and replace data
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }
    }

    // Display linked list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        ReverseLinkedList list = new ReverseLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Original Linked List:");
        list.display();

        list.reverseUsingStack();

        System.out.println("Reversed Linked List:");
        list.display();
    }
}