import java.util.*;
public class Plus_one{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arr[n-1]=arr[n-1]+1;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}