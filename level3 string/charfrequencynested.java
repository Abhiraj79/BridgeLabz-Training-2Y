import java.util.Scanner;

public class CharFrequencyNested {

    public static String[][] findFrequency(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') count++;
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index][0] = "" + chars[i];
                result[index][1] = "" + freq[i];
                index++;
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

        String[][] freqResult = findFrequency(input);
        displayFrequency(freqResult);
    }
}
