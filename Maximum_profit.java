import java.util.*;
public class Maximum_profit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int profit=0;
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]-min>profit){
                profit=arr[i]-min;
            }
        }
        System.out.print(profit);
    }
}
