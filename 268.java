public class Solution {
    public int missingNumber(int[] nums) {
        int corrent=nums.length*(nums.length+1)/2;
        int miss=0;
        for(int i=0;i<nums.length;i++){
            miss+=nums[i];
        }
        return corrent-miss;
    }
}
