public class MyQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor to initialize the queue
    public MyQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // push operation (also known as enqueue) - adds an item to the rear of the queue
    public void push(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot push " + item);
            return;
        }
        System.out.println("Pushing " + item + " to the queue");
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // pop operation (also known as dequeue) - removes and returns the front item
    public int pop() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot pop from empty queue");
            return -1; // Or throw an exception
        }
        int item = arr[front];
        System.out.println("Popping " + item + " from the queue");
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    // peek operation - returns the front item without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; // Or throw an exception
        }
        return arr[front];
    }

    // Utility function to check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Utility function to check if the queue is full
    public boolean isFull() {
        return (count == capacity);
    }

    // Utility function to return the size of the queue
    public int size() {
        return count;
    }

    public static void main(String[] args) {
        // Create a queue of capacity 5
        MyQueue queue = new MyQueue(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Front element is: " + queue.peek()); // Should be 10

        queue.pop(); // Removes 10

        System.out.println("Front element after pop is: " + queue.peek()); // Should be 20

        queue.push(40);
        queue.push(50);
        queue.push(60);
        
        // This will cause an overflow since capacity is 5 and we already have 5 elements (20, 30, 40, 50, 60)
        queue.push(70); 
    }
}
