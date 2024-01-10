import java.util.Scanner;
public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        StringBuilder matchedLetters = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                matchedLetters.append(str1.charAt(i));
            }
        }
        System.out.println("Matched letters at the same index: " + matchedLetters.toString());
    }
}
