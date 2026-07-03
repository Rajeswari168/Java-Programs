import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int count=0;
            int i=0;
            while(i<n){
                count++;
                int limit=a[i]+4;
                while(i<n && a[i] <= limit){
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}
