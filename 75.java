public class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0)return ;
        int left=0;
        int right=nums.length-1;
        int start=0;
        while(start<=right){
            if(nums[start]==0){
                swap(nums,start,left);
                start++;
                left++;
            }
            else if(nums[start]==2){
                swap(nums,right,start);
                right--;
                //start++;
            }
            else start++;
        }
    }
    private void swap(int[] nums, int i,int j){
        int tmp=0;
        tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
