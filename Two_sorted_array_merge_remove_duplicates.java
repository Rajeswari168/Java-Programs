import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int res[]=new int[n+n1];
        int k=0;
        for(int i=0;i<n;i++){
            res[k++]=arr[i];
        }
        for(int i=0;i<n1;i++){
            res[k++]=arr1[i];
        }
        for(int i=0;i<res.length;i++){
            boolean duplicate=false;
            for(int j=0;j<i;j++){
                if(res[i]==res[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                System.out.print(res[i] + " ");
            }
        }
    }
}
