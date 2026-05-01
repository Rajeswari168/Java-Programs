import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if((j-i+1)%2!=0){
                    for(int k=i;k<=j;k++){
                        sum+=arr[k];
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
