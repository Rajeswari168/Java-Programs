import java.util.*;

public class unique_character {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count[]=new int[26];;
        for(int i=0;i<str.length();i++){
            count[str.charAt(i) - 'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i) - 'a']==1){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}
