//283. Move Zeroes
public class Solution {
    public void moveZeroes(int[] nums) {
        int fast=0;
        int slow=0;
        while(fast<nums.length){
            if(nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        Arrays.fill(nums, slow, nums.length, 0);
        //for(; slow < nums.length; slow++)
        //nums[slow] = 0;
}
}
