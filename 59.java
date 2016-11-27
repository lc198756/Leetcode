public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int k=1;
        int top=0,bottom=n-1,left=0,right=n-1;
        while(right>left&&bottom>top){
            for(int i=left;i<right;i++){
                res[top][i]=k++;
            }
            for(int j=top;j<bottom;j++){
                res[j][right]=k++;
            }
            for(int l=right;l>left;l--){
                res[bottom][l]=k++;
            }
            for(int m=bottom;m>top;m--){
                res[m][left]=k++;
            }
            right--;
            left++;
            top++;
            bottom--;
        }
        if(n%2!=0) res[n/2][n/2]=k;
        return res;
    }
}
