import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        String sub = text.substring(5, 2);
        System.out.println("Substring: " + sub);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: start index is greater than end index");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("Calling method to generate Exception:");
        generateException(text);

        System.out.println("Calling method to handle Exception:");
        handleException(text);

        sc.close();
    }
}
