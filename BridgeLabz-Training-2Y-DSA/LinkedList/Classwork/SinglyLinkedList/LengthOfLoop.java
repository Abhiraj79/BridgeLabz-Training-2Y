package SinglyLinkedList;
public class LengthOfLoop {
    public static int findLoopLength(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }
        return 0;
    }
    private static int countLoopLength(Node meetingPoint) {
        Node current = meetingPoint;
        int count = 1;
        while (current.next != meetingPoint) {
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        int length = findLoopLength(head);
        System.out.println("Length of Loop: " + length);
    }
}
