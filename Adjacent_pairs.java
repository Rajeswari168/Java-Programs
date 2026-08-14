import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int n=s1.length();
        boolean first=true;
        int i=0;
        while(i<n){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }else{
                String a="";
                String b="";
                while(i<s1.length() && s1.charAt(i) != s2.charAt(i)){
                    a += s1.charAt(i);
                    b += s2.charAt(i);
                    i++;
                }
                if(!first){
                    System.out.print(" ");
                }
                System.out.print(a + "-" + b);
                first = false;
            }
        }
    }
}
