import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Integer> numStack=new Stack<>();
        Stack<String> strStack=new Stack<>();
        String curr="";
        int n=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }
            else if(ch=='['){
                numStack.push(n);
                strStack.push(curr);
                n=0;
                curr="";
            }
            else if(ch==']'){
                int repeat=numStack.pop();
                String prev=strStack.pop();
                String temp="";
                for(int j=0;j<repeat;j++){
                    temp += curr;
                }
                curr=prev+temp;
            }else{
                curr += ch;
            }
        }
        System.out.print(curr);
    }
}
