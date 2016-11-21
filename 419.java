public class Solution {
    public int countBattleships(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='X'){
                    dfs(board,i,j);
                    res++;
                }
            }
        }
        return res;
    }
    private void dfs(char[][] board,int i,int j){
        if(i<0||i>=board.length||j<0||j>=board[0].length) return ;
        if(board[i][j]=='X'){
            board[i][j]='.';
            dfs(board,i-1,j);
            dfs(board,i+1,j);
            dfs(board,i,j-1);
            dfs(board,i,j+1);
        }
    }
}
