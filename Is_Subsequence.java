import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.print(i==s.length());
    }
}
