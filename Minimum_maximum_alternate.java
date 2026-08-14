import java.util.*;
public class Minimum_maximum_alternate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int left=0;
        int right=n-1;
        int index=0;
        int res[]=new int[n];
        while(left<=right){
            if(right>=left){
                res[index++]=arr[right--];
            }
            if(left<=right){
                res[index++]=arr[left++];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
