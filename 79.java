public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board==null||board.length==0)return false;
        if(word==null||word.length()==0)return false;
        int m=board.length;
        int n=board[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board,word,i,j,0,visited)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board,String word, int i,int j,int len,boolean[][] visited){
        if(len==word.length())return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length)return false;
        if(visited[i][j])return false;
        if(board[i][j]!=word.charAt(len))return false;
        visited[i][j]=true;
        boolean res=dfs(board,word,i-1,j,len+1,visited)||dfs(board,word,i+1,j,len+1,visited)||dfs(board,word,i,j-1,len+1,visited)||dfs(board,word,i,j+1,len+1,visited);
        visited[i][j]=false;
        return res;
    }
}
