import java.util.Scanner;

public class StringLengthDemo {

    public static int getLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int lengthByMethod = getLength(text);
        int lengthByBuiltIn = text.length();

        System.out.println("Length without length() method: " + lengthByMethod);
        System.out.println("Length using length() method: " + lengthByBuiltIn);

        sc.close();
    }
}
