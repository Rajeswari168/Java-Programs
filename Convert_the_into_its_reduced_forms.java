import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]==temp[j]){
                    System.out.print(j + " ");
                    break;
                }
            }
        }
    }
}
