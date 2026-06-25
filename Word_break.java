import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j]) {
                    String sub = s.substring(j, i);
                    for (int k = 0; k < n; k++) {
                        if (sub.equals(words[k])) {
                            dp[i] = true;
                            break;
                        }
                    }
                    if (dp[i]) {
                        break;
                    }
                }
            }
        }
        System.out.println(dp[s.length()]);
    }
}
