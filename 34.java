public class Solution {
    public int[] searchRange(int[] nums, int target) {
      int[] res = {-1, -1};
		int lo = 0, hi = nums.length - 1;
		while(nums[lo] < nums[hi]) {
			int mid = lo + (hi - lo)/2;
			if(nums[mid] > target) {
				hi = mid - 1;
			} else if(nums[mid] < target) {
				lo = mid + 1;
			} else {
				if(nums[lo] !=target) {
					lo++;
				}else if(nums[hi]!=target){
					hi--;
				}
			}
		}
		if(nums[lo] == nums[hi] && nums[lo]== target) {
			res[0] = lo;
			res[1] = hi;
		}

		return res;
}}
