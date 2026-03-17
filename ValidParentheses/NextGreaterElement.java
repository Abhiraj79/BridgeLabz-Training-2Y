import java.util.*;

public class NextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = nextGreater(arr);

        // Output result
        System.out.println("Next Greater Elements:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}