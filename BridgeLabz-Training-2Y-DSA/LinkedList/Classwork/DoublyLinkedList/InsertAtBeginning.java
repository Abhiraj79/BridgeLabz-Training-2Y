package DoublyLinkedList;

class InsertBeginning {

    static class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
        }
    }

    static Node insertAtBeginning(Node head, int x) {

        Node newNode = new Node(x);

        newNode.next = head;

        if (head != null)
            head.prev = newNode;

        return newNode;
    }

    static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;

        head = insertAtBeginning(head, 5);

        print(head);
    }
}
