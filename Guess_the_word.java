import java.util.*;
public class Guess_the_word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        int max=0;
        for(int i=0;i<n;i++){
            String str=sc.next();
            if(str.length() % 2 != 0 && str.length()>max){
                max=str.length();
                ans=str;
            }
        }
        if(max==0){
            System.out.print("Better luck next time");
        }else{
            System.out.print(ans);
        }
    }
}
