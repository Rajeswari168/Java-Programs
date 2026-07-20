import java.util.*;
public class subsequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<t.length()-1;j++){
                if(s.charAt(i)==t.charAt(j)){
                    System.out.print("true");
                    return;
                }
            }
        }
        System.out.print("false");
    }
}
