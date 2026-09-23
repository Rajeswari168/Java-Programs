import java.util.*;
public class Reverse_number_using_recursion {
    static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        int digit=n%10;
        rev=rev*10+digit;
        n=n/10;
        return reverse(n,rev);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(reverse(n,0));
    }
}
