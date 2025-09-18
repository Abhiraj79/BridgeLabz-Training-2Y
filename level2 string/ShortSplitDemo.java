import java.util.Scanner;

public class ShortSplitDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        int length = 0;
        while (true) {
            try { text.charAt(length); length++; } 
            catch (IndexOutOfBoundsException e) { break; }
        }

        int wordCount = 1;
        for (int i = 0; i < length; i++) if (text.charAt(i) == ' ') wordCount++;

        String[] wordsByMethod = new String[wordCount];
        int start = 0, idx = 0;
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) word += text.charAt(j);
                wordsByMethod[idx++] = word;
                start = i + 1;
            }
        }

        String[] wordsByBuiltIn = text.split(" ");

        System.out.print("User method: ");
        for (String w : wordsByMethod) System.out.print(w + " ");
        System.out.println();

        System.out.print("Built-in: ");
        for (String w : wordsByBuiltIn) System.out.print(w + " ");
        System.out.println();

        boolean same = wordsByMethod.length == wordsByBuiltIn.length;
        if (same) {
            for (int i = 0; i < wordsByMethod.length; i++)
                if (!wordsByMethod[i].equals(wordsByBuiltIn[i])) { same = false; break; }
        }
        System.out.println("Are both results same? " + same);

        sc.close();
    }
}
