import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int total=0;
        for(int i=0;i<n;i++){
            int start=Math.max(0,i-arr[i]);
            if(start==0){
                total+=prefix[i];
            }else{
                total+=prefix[i]-prefix[start - 1];
            }
        }
        System.out.println(total);
    }
}
