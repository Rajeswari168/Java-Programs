import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n<=0){
	        System.out.print("false");
	        return;
	    }
	    while(n%2==0){
	        n/=2;
	    }
	    System.out.print(n==1);
	}
}
