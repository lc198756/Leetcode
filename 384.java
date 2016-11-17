public class Solution {
    private int[] nums;
    private int[] res;
    private Random random;
    public Solution(int[] nums) {
        this.nums=nums;
        this.res=Arrays.copyOf(nums,nums.length);
        this.random=new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.res=Arrays.copyOf(nums,nums.length);
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int n=res.length;
        for(int i=0;i<n;i++){
            int r=random.nextInt(n-i);
            int tmp=res[i];
            res[i]=res[r+i];
            res[r+i]=tmp;
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
