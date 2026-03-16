package SinglyLinkedList;
public class DeleteLastOccurence {
    static Node deleteLastOccurrence(Node head, int target) {
        if (head == null) return null;
        Node curr = head;
        Node prev = null;
        Node lastPrev = null;
        Node lastNode = null;
        while (curr != null) {
            if (curr.data == target) {
                lastPrev = prev;
                lastNode = curr;
            }
            prev = curr;
            curr = curr.next;
        }
        if (lastNode == null) {
            return head;
        }
        if (lastPrev == null) {
            head = head.next;
        } else {
            lastPrev.next = lastNode.next;
        }
        return head;
    }

    static void printList(Node head) {
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
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        printList(head);
        head = deleteLastOccurrence(head, 2);
        printList(head);
    }
}
