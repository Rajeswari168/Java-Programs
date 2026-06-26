import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        String prefix="";
        for(int i=0;i<str[0].length();i++){
            char ch=str[0].charAt(i);
            for(int j=1;j<n;j++){
                if(i>=str[j].length() || str[j].charAt(i) != ch){
                    if(prefix.length()==0){
                        System.out.print("-1");
                    }else{
                        System.out.print(prefix);
                    }
                    return;
                }
            }
            prefix=prefix+ch;
        }
        if(prefix.length()==0){
            System.out.print("-1");
        }else{
            System.out.print(prefix);
        }
    }
}
