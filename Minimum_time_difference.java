import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] time=new String[n];
        for(int i=0;i<n;i++){
            time[i]=sc.next();
        }
        int[] minutes=new int[n];
        for(int i=0;i<n;i++){
            int hour=(time[i].charAt(0) - '0') * 10 + (time[i].charAt(1) - '0');
            int minute=(time[i].charAt(3) - '0') * 10 + (time[i].charAt(4) - '0');
            minutes[i]=hour*60+minute;
        }
        Arrays.sort(minutes);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            min=Math.min(min,minutes[i] - minutes[i-1]);
        }
        int last=1440-minutes[n-1] + minutes[0];
        min=Math.min(min,last);
        System.out.println(min);
    }
}
