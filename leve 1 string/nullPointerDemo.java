public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: text is null");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to generate Exception:");
        generateException();

        System.out.println("Calling method to handle Exception:");
        handleException();
    }
}
