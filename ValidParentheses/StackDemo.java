import java.util.Scanner;

class Stack {
    private int[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Method to create new array and copy old data
    public void resizeStack() {
        int newSize = size * 2;
        int[] newArr = new int[newSize];

        // Copy old array data
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        size = newSize;

        System.out.println("Stack size increased to " + size);
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Full. Resizing...");
            resizeStack();
        }
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial stack size: ");
        int n = sc.nextInt();

        Stack stack = new Stack(n);

        System.out.print("Enter number of elements to push: ");
        int m = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            stack.push(sc.nextInt());
        }

        stack.display();

        System.out.println("Pop element: " + stack.pop());
        stack.display();

        sc.close();
    }
}