import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int dp[][]=new int[k+1][n+1];
        int m=0;
        while(dp[m][n]<k){
            m++;
            for(int i=1;i<=n;i++){
                dp[m][i]=1+dp[m-1][i-1]+dp[m-1][i];
            }
        }
        System.out.print(m);
    }
}
