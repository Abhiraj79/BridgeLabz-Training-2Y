import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean sameByCharAt = true;

        if (str1.length() != str2.length()) {
            sameByCharAt = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    sameByCharAt = false;
                    break;
                }
            }
        }

        boolean sameByEquals = str1.equals(str2);

        System.out.println("Using charAt(): " + sameByCharAt);
        System.out.println("Using equals(): " + sameByEquals);

        if (sameByCharAt == sameByEquals) {
            System.out.println("Both methods give same result.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}
