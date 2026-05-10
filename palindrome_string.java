import java.util.*;
public class palindrome_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int left=0; 
        int right=str.length()-1;
        boolean flag=true;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                flag=false;
                break;
            }
            left++;
            right--;
        }
        System.out.print(flag);
    }
}
