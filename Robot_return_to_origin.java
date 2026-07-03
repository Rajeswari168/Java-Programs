import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String moves=sc.next();
        int x=0,y=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                y++;
            }else if(ch=='D'){
                y--;
            }else if(ch=='L'){
                x--;
            }else if(ch=='R'){
                x++;
            }
        }
        System.out.print(x==0 && y==0);
    }
}
