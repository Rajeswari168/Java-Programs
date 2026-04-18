import java.util.Scanner;
public class multipletable{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=10;i++){
for(int j=1;j<=10;j++)
System.out.print((i * j) + " ");
System.out.println();
}
}
}