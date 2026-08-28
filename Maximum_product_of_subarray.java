import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        if(n==1){
            System.out.println(max);
        }else{
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    int product = 1;
                    for(int k=i;k<=j;k++){
                        product *= arr[k];
                    }
                    if(max < product){
                        max = product;
                    }
                }
            }
        }
        System.out.println(max);
    }
    
}
