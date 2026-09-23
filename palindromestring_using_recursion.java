import java.util.*;
public class palindromestring_using_recursion {
    static void palindrome(String str,String org, int index){
        if(index<0){
            if(str.equals(org)){
                System.out.print("palindrome");
            }else{
                System.out.print("not palindrome");
            }
            return;
        }
        palindrome(str, org, index-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String org=str;
        palindrome(str,org,str.length()-1);
    }
}
