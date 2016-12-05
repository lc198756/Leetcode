public class Solution {
    public int minMoves(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length;i++)min=Math.min(min,nums[i]);
        for(int i=0;i<nums.length;i++)res=res+nums[i]-min;
        return res;
    }
}
