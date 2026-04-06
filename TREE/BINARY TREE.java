public class BinaryTree {

    static class Node {
        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
        }
    }

    // 🔹 Preorder
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // 🔹 Inorder
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // 🔹 Postorder
    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Node root = new Node('A');

        root.left = new Node('B');
        root.right = new Node('C');

        root.left.left = new Node('D');
        root.left.right = new Node('E');

        root.right.left = new Node('G');
        root.right.right = new Node('H');

        root.left.right.left = new Node('I');
        root.left.right.right = new Node('J');

        root.right.left.left = new Node('K');

        // ✅ Output
        System.out.print("Preorder: ");
        preorder(root);

        System.out.print("\nInorder: ");
        inorder(root);

        System.out.print("\nPostorder: ");
        postorder(root);
    }
}
