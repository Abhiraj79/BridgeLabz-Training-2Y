package SinglyLinkedList;

public class SwapConsecutivePairs {
    public static Node swapPairs(Node head) {
        Node prev = null;
        Node current = head;
        head = head.next;
        while (current != null && current.next != null) {
            Node next = current.next;
            Node nextPair = next.next;
            next.next = current;
            current.next = nextPair;
            if(prev != null) {
                prev.next = next;
            }
            prev = current;
            current = nextPair;
        }
        return head;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head = swapPairs(head);
        printList(head);
    }
}
