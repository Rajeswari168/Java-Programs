import java.util.Scanner;
public class skipeven{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%2!=0){
                System.out.print(i +"\t");
        }
    }
}
}