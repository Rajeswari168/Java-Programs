import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n=s1.length();
        int m=s2.length();
        if(n-m>1 || m-n>1){
            System.out.print(false);
            return;
        }
        int i=0,j=0,count=0;
        while(i<n && j<m){
            if(s1.charAt(i) != s2.charAt(j)){
                count++;
                if(count>1){
                    System.out.print(false);
                    return;
                }
                else if(n>m){
                    i++;
                }
                else if(m>n){
                    j++;
                }else{
                    i++;
                    j++;
                }
            }else{
                i++;
                j++;
            }
        }
        if(i<n || i<m){
            count++;
        }
        System.out.print(count <= 1);
    }
}  QUESTION EPDI SAVE PANNURATHU SIMPLE
