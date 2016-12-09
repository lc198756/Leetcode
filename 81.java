public class Solution {
    public boolean search(int[] nums, int target) {
        if(nums==null||nums.length==0)return false;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)return true;
            else if(nums[mid]<target){
                if(nums[low]<nums[mid])low=mid+1;
                else if(nums[low]==nums[mid])low++;
                else{
                    if(target>nums[high])high=mid-1;
                    else low=mid+1;
                }
            }
            else{
                if(nums[mid]<nums[high])high=mid-1;
                else if(nums[mid]==nums[high])high--;
                else {
                    if (target<nums[low])low=mid+1;
                    else high=mid-1;
                }
            }
        }
        return false;
    }
}
