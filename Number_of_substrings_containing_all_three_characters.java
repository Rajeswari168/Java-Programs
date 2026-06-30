import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count[]=new int[3];
        int left=0;
        int ans=0;
        for(int right=0;right<s.length();right++){
            count[s.charAt(right) - 'a']++;
            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                ans += s.length() -right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        System.out.print(ans);
    }
}
