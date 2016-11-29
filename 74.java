public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0)return false;
        if(target==matrix[0][0])return true;
        int n=matrix[0].length;
        int l=0;
        int h=matrix.length-1;
        while(h>=l){
            int m=(l+h)/2;
            if(matrix[m][0]==target){
                return true;
            }
            else if(matrix[m][0]>target)h=m-1;
            else l=m+1;
        }
        if(h<0)return false;
        int left=0;
        int right=matrix[0].length-1;
        while(right>=left){
            int m=(left+right)/2;
            if(matrix[h][m]==target)return true;
            else if(matrix[h][m]>target)right=m-1;
            else left=m+1;
        }
        return false;
    }
}
