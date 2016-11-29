public class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix==null||matrix.length==0)return;
        boolean[][] tmp=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    line(tmp,i);
                    row(tmp,j);
                }
            }

        }
        for(int i=0;i<tmp.length;i++){
                for(int j=0;j<tmp[0].length;j++){
                    if(tmp[i][j]==true) matrix[i][j]=0;
                }
            }

    }
    private void line(boolean[][] tmp,int i){
            for(int x=0;x<tmp[0].length;x++){
                tmp[i][x]=true;
            }
        }
         private void row(boolean[][] tmp,int j){
            for(int x=0;x<tmp.length;x++){
                tmp[x][j]=true;
            }
        }
}
