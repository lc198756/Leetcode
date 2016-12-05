public class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid==null||grid.length==0)return 0;
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) res+=helper(grid,i,j);
            }
        }
        return res;
    }
    private int helper(int[][] grid,int i,int j){
        int result=0;
        if(i-1<0||grid[i-1][j]==0)result++;
        if(j-1<0||grid[i][j-1]==0)result++;
        if(i+1>=grid.length||grid[i+1][j]==0)result++;
        if(j+1>=grid[0].length||grid[i][j+1]==0)result++;
        return result;
    }
}
