import java.util.*;
public class remove_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean[] visited = new boolean[256];
        String letters = "";
        String digits = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                if (Character.isLetter(ch))
                    letters += ch;
                else if (Character.isDigit(ch))
                    digits += ch;
            }
        }
        // Print all letters except the last one
        for (int i = 0; i < letters.length() - 1; i++)
            System.out.print(letters.charAt(i));
        // Print digits in reverse order
        for (int i = digits.length() - 1; i >= 0; i--)
            System.out.print(digits.charAt(i));
        // Print the last letter
        System.out.print(letters.charAt(letters.length() - 1));
    }
}