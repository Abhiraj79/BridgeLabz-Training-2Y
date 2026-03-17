class TwoStacks {
    int arr[];
    int size;
    int top1, top2;

    // Constructor
    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    // Push in Stack1
    void push1(int x) {
        if (top1 + 1 < top2) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Push in Stack2
    void push2(int x) {
        if (top1 + 1 < top2) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Pop from Stack1
    int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack1 Underflow");
            return -1;
        }
    }

    // Pop from Stack2
    int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack2 Underflow");
            return -1;
        }
    }
}

public class TwoStacksOneArray {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);

        ts.push1(10);
        ts.push1(20);
        ts.push2(30);
        ts.push2(40);

        System.out.println(ts.pop1()); // 20
        System.out.println(ts.pop2()); // 40
    }
}