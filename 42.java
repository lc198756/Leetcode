public class Solution {
    public int trap(int[] height) {
        if(height==null||height.length<3) return 0;
        int[] left=new int[height.length];
        //int[] right=new int[height.length];
        int max=0;
        int res=0;
        for(int i=0;i<height.length;i++){
            left[i]=max;
            max=Math.max(height[i],max);
        }
        max=0;
        for(int i=height.length-1;i>=0;i--){
            left[i]=Math.min(left[i],max);
            max=Math.max(max,height[i]);
            if(left[i]-height[i]>0){
                res+=left[i]-height[i];
            }
        }
        return res;
    }
}
