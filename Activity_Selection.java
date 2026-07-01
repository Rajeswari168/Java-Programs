import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start[]=new int[n];
        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
        }
        int finish[]=new int[n];
        for(int i=0;i<n;i++){
            finish[i]=sc.nextInt();
        }
        int count=1;
        int last=0;
        for(int i=1;i<n;i++){
            if(start[i]>finish[last]){
                count++;
                last=i;
            }
        }
        System.out.println(count);
    }
}
