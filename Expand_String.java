import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<String> stack = new Stack<>();
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(current);
                current = "";
            }
            else if (ch == ')') {
                int j = i + 1;
                int n = 1;
                if (j < s.length() && s.charAt(j) == '{') {
                    j++;
                    n = 0;
                    while (j < s.length() && Character.isDigit(s.charAt(j))) {
                        n = n * 10 + (s.charAt(j) - '0');
                        j++;
                    }
                    j++; // skip }
                }
                String temp = "";
                for (int k = 0; k < n; k++) {
                    temp += current;
                }
                current = stack.pop() + temp;
                i = j - 1;
            }
            else if (ch == '{') {
                int j = i + 1;
                int n = 0;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    n = n * 10 + (s.charAt(j) - '0');
                    j++;
                }
                j++; // skip }
                String temp = "";
                for (int k = 1; k < n; k++) {
                    temp += current;
                }
                current += temp;
                i = j - 1;
            }
            else {
                current += ch;
            }
        }
        System.out.println(current);
    }
}
