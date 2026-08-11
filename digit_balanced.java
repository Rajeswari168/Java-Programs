import java.util.*;
public class digit_balanced {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        int mid=len/2;
        int left=0;
        int right=0;
        for(int i=0;i<mid;i++){
            left += str.charAt(i) - '0';
        }
        for(int i=mid;i<len;i++){
            right += str.charAt(i) - '0';
        }
        if(left==right){
            System.out.print("Balanced");
        }else{
            System.out.print("Not Balanced");
        }
    }
}
