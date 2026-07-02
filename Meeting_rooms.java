import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start[]=new int[n];
        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
        }
        int end[]=new int[n];
        for(int i=0;i<n;i++){
            end[i]=sc.nextInt();
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int i=0,j=0;
        int rooms=0,ans=0;
        while(i<n){
            if(start[i]<end[j]){
                rooms++;
                ans=Math.max(ans,rooms);
                i++;
            }else{
                rooms--;
                j++;
            }
        }
        System.out.print(ans);
    }
}
