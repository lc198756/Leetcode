public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i ++) {
            Integer f = set.floor(nums[i]);
            Integer c = set.ceiling(nums[i]);
            if (f != null && Math.abs((long)nums[i] - (long)f) <= t) {
                return true;
            }
            if (c != null && Math.abs((long)nums[i] - (long)c) <= t) {
                return true;
            }
            set.add(nums[i]);
            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
