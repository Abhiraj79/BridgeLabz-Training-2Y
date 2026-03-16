package SinglyLinkedList;
public class CircularLinkedList{
    public static void main(String[] args){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = head;
        Node temp = head;
        if(head != null){
            while(true){
                System.out.print(temp.data + " ");
                temp = temp.next;
                if(temp == head) break;
            }
        }
    }
}
