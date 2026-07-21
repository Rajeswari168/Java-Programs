import java.util.*;
public class beautiful_substring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int res=0;
        int count=1;
        int type=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i) < word.charAt(i-1)){
                count=1;
                type=1;
            }else{
                count++;
                if(word.charAt(i) > word.charAt(i-1)){
                    type++;
                }
            }
            if(type==5){
                res=Math.max(res,count);
            }
        }
        System.out.println(res);
    }
}