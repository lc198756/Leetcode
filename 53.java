public class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0;
        int move=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cur<0){
                cur=0;
            }
            cur+=nums[i];
            move=Math.max(move,cur);
        }
        return move;
    }
}
