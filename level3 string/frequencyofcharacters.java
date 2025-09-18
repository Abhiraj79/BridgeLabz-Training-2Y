import java.util.Scanner;

public class CharFrequency {

    public static String[][] findCharFrequency(String str) {
        int[] freq = new int[256];
        int length = 0;

        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (Exception e) {
        }

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            freq[c]++;
        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (freq[str.charAt(i)] != 0) {
                count++;
                freq[str.charAt(i)] = -freq[str.charAt(i)]; // mark as counted
            }
        }

        String[][] result = new String[count][2];
        int index = 0;
        freq = new int[256];
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            freq[c]++;
        }

        boolean[] visited = new boolean[256];
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (!visited[c]) {
                result[index][0] = "" + c;
                result[index][1] = "" + freq[c];
                index++;
                visited[c] = true;
            }
        }

        return result;
    }

    public static void displayFrequency(String[][] freqArray) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        System.out.println("--------------------");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.printf("%-10s %-10s\n", freqArray[i][0], freqArray[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] freqResult = findCharFrequency(input);
        displayFrequency(freqResult);
    }
}
