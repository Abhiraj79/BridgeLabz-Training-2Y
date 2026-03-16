package SinglyLinkedList;
/*
    *Code for reversing the linked list
    *
    * 1--->2--->3--->4--->null
    * to
    * 4--->3--->2--->1--->null
 */
public class ReverseLinkedList {
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        printList(head);
        head = reverse(head);
        printList(head);
    }
}
