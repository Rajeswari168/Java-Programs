import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
            }
            else if (!Character.isLetterOrDigit(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(arr));
    }
}
