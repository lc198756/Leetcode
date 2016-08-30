public class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i=i+2){
            int tmp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=tmp;

        }
}
}
//O(N)
public class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            // 需要交换的情况：奇数时nums[i] < nums[i - 1]或偶数时nums[i] > nums[i - 1]
            if((i % 2 == 1 && nums[i] < nums[i-1]) || (i % 2 == 0 && nums[i] > nums[i-1])){
                int tmp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
