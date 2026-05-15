import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String goal = sc.nextLine();
        if(s.length() != goal.length()) {
            System.out.println(false);
            return;
        }
        int n = s.length();
        boolean found = false;
        for(int k = 0; k < n; k++) {
            String rotated = "";
            for(int i = k; i < n; i++) {
                rotated += s.charAt(i);
            }
            for(int i = 0; i < k; i++) {
                rotated += s.charAt(i);
            }
            if(rotated.equals(goal)) {
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
