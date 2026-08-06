import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int song=arr[k-1];
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==song){
                System.out.print(i+1);
                break;
            }
        }
    }
}
