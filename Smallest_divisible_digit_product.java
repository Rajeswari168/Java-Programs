import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        while(true){
            int num=n;
            int product=1;
            while(num>0){
                product *= (num%10);
                num /= 10;
            }
            if(product%t==0){
                System.out.print(n);
                break;
            }
            n++;
        }
    }
}
