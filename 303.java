public class NumArray {
    private int[] a;
    public NumArray(int[] nums) {
        int sum=0;
        a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            a[i]=sum;
        }
    }

    public int sumRange(int i, int j) {
        return i==0?a[j]:a[j]-a[i-1];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);
