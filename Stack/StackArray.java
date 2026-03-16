class StackArray {

    int maxSize;
    int[] stack;
    int top;

    // Constructor
    StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // Push function
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop function
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }

    // isEmpty function
    boolean isEmpty() {
        return (top == -1);
    }

    // Display function (optional)
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Main method
    public static void main(String[] args) {

        StackArray s = new StackArray(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped element: " + s.pop());

        s.display();
    }
} 