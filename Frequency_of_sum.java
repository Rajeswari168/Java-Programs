import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int f=1;f<n;f++){
            int sum=0;
            for(int i=0;i<n;i++){
                int count=0;
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                if(count==f){
                    boolean duplicate=false;
                    for(int j=0;j<i;j++){
                        if(arr[i]==arr[j]){
                            duplicate=true;
                            break;
                        }
                    }
                    if(!duplicate){
                        sum += arr[i]*count;
                    }
                }
            }
            if(sum>0){
                System.out.println(f + " -> " + sum);
            }
        }
    }
}
