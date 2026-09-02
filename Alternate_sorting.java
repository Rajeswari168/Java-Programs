import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[right--] + " ");
            }else{
                System.out.print(arr[left++] + " ");
            }
        }
    }
}
