import java.util.*;
public class dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String dict[] = new String[n];
        for (int i = 0; i < n; i++) {
            dict[i] = sc.next();
        }
        String temp = "";
        for (int i = 0; i < n; i++) {
            if (str.contains(dict[i])) {
                temp += dict[i];
            }
        }
        if (temp.equals(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
