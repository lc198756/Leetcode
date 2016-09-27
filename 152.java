public class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0||nums==null)return 0;
        int res=Integer.MIN_VALUE;
        int max=1;
        int min=1;
        for(int i=0;i<nums.length;i++){
            int temp1=max*nums[i];
            int temp2=min*nums[i];
            max=Math.max(nums[i],Math.max(temp1,temp2));
            min=Math.min(nums[i],Math.min(temp1,temp2));
            res=Math.max(res,max);
        }
        return res;
    }
}
