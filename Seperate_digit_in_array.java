import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            int temp = nums[i];
            while(temp > 0) {
                count++;
                temp = temp / 10;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for(int i = 0; i < n; i++) {
            String s = nums[i] + "";
            for(int j = 0; j < s.length(); j++) {
                result[index] = s.charAt(j) - '0';
                index++;
            }
        }
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
