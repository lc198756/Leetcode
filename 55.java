public class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<=max&&i<nums.length;i++){
            if(nums[i]+i>=max) max=nums[i]+i;
            if(max>=nums.length-1) return true;
        }
        return false;
    }
}
