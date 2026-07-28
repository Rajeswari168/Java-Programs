import java.util.*;
public class app_version {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String v1=sc.next();
        String v2=sc.next();
        int i=0,j=0;
        while(i<v1.length() || j<v2.length()){
            int n1=0,n2=0;
            while(i<v1.length() && v1.charAt(i)!='.'){
                n1=n1*10+(v1.charAt(i)-'0');
                i++;
            }
            while(j<v2.length() && v2.charAt(j)!='.'){
                n2=n2*10+(v2.charAt(j)-'0');
                j++;
            }
            if(n1>n2){
                System.out.print("Downgraded");
                return;
            }
            if(n1<n2){
                System.out.print("upgraded");
                return;
            }
            i++;
            j++;
        }
        System.out.print("Equal");
    }
}
