import java.util.*;
public class Word_search{
    static boolean dfs(char[][] board, String word, int i, int j, int k){
        if(k==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length ||board[i][j] != word.charAt(k)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        boolean found=dfs(board,word,i+1,j,k+1) || dfs(board,word,i-1,j,k+1) || dfs(board,word,i,j+1,k+1) || dfs(board,word,i,j-1,k+1);
        board[i][j]=temp;
        return found;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char board[][]=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                board[i][j]=sc.next().charAt(0);
            }
        }
        String word=sc.next();
        boolean result=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(board,word,i,j,0)){
                    result=true;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}