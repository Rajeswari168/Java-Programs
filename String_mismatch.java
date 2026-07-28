import java.util.*;

public class String_mismatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int i = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {

                StringBuilder a = new StringBuilder();
                StringBuilder b = new StringBuilder();

                while (i < s1.length() && s1.charAt(i) != s2.charAt(i)) {
                    a.append(s1.charAt(i));
                    b.append(s2.charAt(i));
                    i++;
                }

                System.out.print(a + "-" + b);

                if (i < s1.length())
                    System.out.print(" ");
            } else {
                i++;
            }
        }
    }
}