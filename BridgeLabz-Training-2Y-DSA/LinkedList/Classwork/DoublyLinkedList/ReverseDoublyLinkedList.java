package DoublyLinkedList;
public class ReverseDoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    Node head;
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }
//    public static Node reverse(Node head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        Node newHead = reverse(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }
    public void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }
//        while (current != null) {
//            temp = current.next;
//            current.next = current.prev;
//            current.prev = temp;
//            current = current.next;
//        }
//        if (temp != null) {
//            head = temp.next;
//        }
//    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseDoublyLinkedList list = new ReverseDoublyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.display();
        list.reverse();
        list.display();
    }
}
