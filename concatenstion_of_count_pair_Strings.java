import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String s1 = arr[i];
                String s2 = arr[j];
                boolean result = false;
                // Check whether s1 and s2 have at least one common character
                for (int a = 0; a < s1.length(); a++) {
                    for (int b = 0; b < s2.length(); b++) {
                        if (s1.charAt(a) == s2.charAt(b)) {
                            result = true;
                            break;
                        }
                    }
                    if (result) {
                        break;
                    }
                }
                if (result) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
