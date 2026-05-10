import java.util.*;

public class length_of_lastword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().trim();
        int count=0;
        int i=str.length()-1;
        while(i>=0 && str.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && str.charAt(i) != ' '){
            count++;
            i--;
        }
        System.out.print(count);
    }
}
