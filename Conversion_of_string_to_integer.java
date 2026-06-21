import java.util.*;
public class Main{
    public static void main(String[] aargs){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int num=0;
        for(int i=0;i<str.length();i++){
            num=num*10+(str.charAt(i) - '0');
        }
        System.out.print(num);
    }
}
