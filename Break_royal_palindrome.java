import java.util.*;
public class Break_royal_palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        if(n==1){
            System.out.println("IMPOSSIBLE");
            return;
        }
        char ch[]=str.toCharArray();
        boolean changed=false;
        for(int i=0;i<n/2;i++){
            if(ch[i]!='a'){
                ch[i]='a';
                changed=true;
                break;
            }
        }
        if(!changed){
            ch[n-1]='b';
        }
        System.out.print(new String(ch));
    }
}