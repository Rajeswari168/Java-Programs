import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String txt=sc.next();
        String pat=sc.next();
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<n;i++){
            char t=txt.charAt(i);
            char p=pat.charAt(i);
            if(p==t || p=='*' || p=='?'){
                System.out.print("true");
                return;
            }else{
                System.out.print("false");
                return;
            }
        }
    }
}
