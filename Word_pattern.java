import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.next();
        sc.nextLine();
        String s = sc.nextLine();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            System.out.println(false);
            return;
        }
        boolean flag = true;
        for (int i = 0; i < pattern.length(); i++) {
            for (int j = i + 1; j < pattern.length(); j++) {
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    if (!words[i].equals(words[j])) {
                        flag = false;
                    }
                } else {
                    if (words[i].equals(words[j])) {
                        flag = false;
                    }
                }
            }
        }
        System.out.println(flag);
    }
}
