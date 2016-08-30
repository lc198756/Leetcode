public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){

            if(i == 0 || nums[i] > nums[i-1]){
                int target = -nums[i];
                int left = i + 1;
                int right = nums.length-1;
                while(left < right){
                    if(nums[left] + nums[right] < target){
                        left++;
                    }
                    else if(nums[left] + nums[right] > target){
                        right--;
                    }
                    else{
                        ArrayList<Integer> l = new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[left]);
                        l.add(nums[right]);
                        ret.add(l);
                        left++;
                        right--;

                        while(left < right && nums[left] == nums[left-1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        return ret;
    }
}
//2
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            if(nums[i] > 0) break;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum <= 0) while(nums[j] == nums[++j] && j < k);
                if(sum >= 0) while(nums[k--] == nums[k] && j < k);
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        return result;
    }
}
