class NodeA {
    int data;
    NodeA next;

    NodeA(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedStack {
    private NodeA top;

    public LinkedStack() {
        this.top = null;
    }

    // PUSH
    public void push(int x) {
        NodeA newNode = new NodeA(x);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + x);
    }

    // POP
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    // PEEK
    public int peek() {
        if (!isEmpty()) {
            return top.data;
        }
        System.out.println("Stack is Empty!");
        return -1;
    }

    // ISEMPTY
    public boolean isEmpty() {
        return top == null;
    }
}

public class ArrayListUsingTwoStacks {
    public static void main(String[] args) {
        LinkedStack st = new LinkedStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Peek: " + st.peek()); // 30
        System.out.println("Pop: " + st.pop());   // 30
        System.out.println("Pop: " + st.pop());   // 20
        System.out.println("Is Empty: " + st.isEmpty());
    }
}